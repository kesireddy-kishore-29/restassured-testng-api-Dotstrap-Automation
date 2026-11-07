# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[7]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-d4720677-6543-452c-8e7f-d135feb7b4fa` |
| 2 | `POST /v1/accounts` | 201 | 70 | `qa-a9a6a2f1-1def-432b-a00c-801aa640ebfb` |
| 3 | `POST /v1/auth/token` | 200 | 8 | `qa-325dc3d4-089a-4bf3-99d7-790f8bbd0614` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-df7754fa-3a26-4cca-a9bc-86773f8c7415` |
| 5 | `PATCH /v1/accounts/me` | 415 | 11 | `qa-09a1b207-752f-4277-a5a7-9fe2f3389aaa` |
| 6 | `POST /v1/auth/token` | 200 | 17 | `qa-ee978557-bc6b-4447-969c-c4a36c4f41a8` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-c6dd1410-e196-48f9-9055-78e5157e54df` |
| 8 | `POST /v1/auth/token` | 401 | 4 | `qa-27244385-38b7-4bd3-a798-188255267aaf` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-910e082b-37f3-431e-8d46-06ea803e902b` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-dd282827-ce63-480c-b523-abf4a6850653` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d4720677-6543-452c-8e7f-d135feb7b4fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4720677-6543-452c-8e7f-d135feb7b4fa
Content-Type: application/json

--- request body ---
{"handle":"qa-fa6a6db05b07","displayName":"QA fa6a6db05b07","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-d4720677-6543-452c-8e7f-d135feb7b4fa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 497
RateLimit-Reset: 9
Location: /v1/accounts/qa-fa6a6db05b07
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1cd80720-01ae-4083-af48-0171d1c70344","handle":"qa-fa6a6db05b07","displayName":"QA fa6a6db05b07","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.404417334Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a9a6a2f1-1def-432b-a00c-801aa640ebfb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9a6a2f1-1def-432b-a00c-801aa640ebfb
Content-Type: application/json

--- request body ---
{"handle":"qa-de42f9c212c5","displayName":"QA de42f9c212c5","password":"****","region":"eu"}

--- response: 201 in 70 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-a9a6a2f1-1def-432b-a00c-801aa640ebfb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 484
RateLimit-Reset: 9
Location: /v1/accounts/qa-de42f9c212c5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_19634dbf-644f-4346-b90c-f4474d843982","handle":"qa-de42f9c212c5","displayName":"QA de42f9c212c5","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.482550302Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-325dc3d4-089a-4bf3-99d7-790f8bbd0614

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-325dc3d4-089a-4bf3-99d7-790f8bbd0614
Content-Type: application/json

--- request body ---
{"handle":"qa-fa6a6db05b07","password":"****"}

--- response: 200 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-325dc3d4-089a-4bf3-99d7-790f8bbd0614
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 477
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1cd80720-01ae-4083-af48-0171d1c70344"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-df7754fa-3a26-4cca-a9bc-86773f8c7415

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df7754fa-3a26-4cca-a9bc-86773f8c7415
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-de42f9c212c5","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-df7754fa-3a26-4cca-a9bc-86773f8c7415
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/conversations/cnv_7b7d1f87-4644-4f40-829c-f31b251b9fa5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7b7d1f87-4644-4f40-829c-f31b251b9fa5","subject":"Error contract","status":"open","region":"eu","participants":["qa-fa6a6db05b07","qa-de42f9c212c5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:02.538301909Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-09a1b207-752f-4277-a5a7-9fe2f3389aaa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09a1b207-752f-4277-a5a7-9fe2f3389aaa
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 11 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-09a1b207-752f-4277-a5a7-9fe2f3389aaa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 255

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts/me","correlationId":"qa-09a1b207-752f-4277-a5a7-9fe2f3389aaa"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ee978557-bc6b-4447-969c-c4a36c4f41a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee978557-bc6b-4447-969c-c4a36c4f41a8
Content-Type: application/json

--- request body ---
{"handle":"qa-de42f9c212c5","password":"****"}

--- response: 200 in 17 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee978557-bc6b-4447-969c-c4a36c4f41a8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 467
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_19634dbf-644f-4346-b90c-f4474d843982"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c6dd1410-e196-48f9-9055-78e5157e54df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6dd1410-e196-48f9-9055-78e5157e54df
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c6dd1410-e196-48f9-9055-78e5157e54df
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-27244385-38b7-4bd3-a798-188255267aaf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27244385-38b7-4bd3-a798-188255267aaf
Content-Type: application/json

--- request body ---
{"handle":"qa-de42f9c212c5","password":"****"}

--- response: 401 in 4 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-27244385-38b7-4bd3-a798-188255267aaf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 459
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-27244385-38b7-4bd3-a798-188255267aaf"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-910e082b-37f3-431e-8d46-06ea803e902b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-910e082b-37f3-431e-8d46-06ea803e902b
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-910e082b-37f3-431e-8d46-06ea803e902b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-dd282827-ce63-480c-b523-abf4a6850653

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd282827-ce63-480c-b523-abf4a6850653
Content-Type: application/json

--- request body ---
{"handle":"qa-fa6a6db05b07","password":"****"}

--- response: 401 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dd282827-ce63-480c-b523-abf4a6850653
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 454
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dd282827-ce63-480c-b523-abf4a6850653"}
```

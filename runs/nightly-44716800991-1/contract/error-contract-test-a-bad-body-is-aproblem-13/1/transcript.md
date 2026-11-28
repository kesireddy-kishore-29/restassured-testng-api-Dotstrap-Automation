# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[13]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 41 | `qa-a8b42eef-d775-46d6-9757-e39706c67b85` |
| 2 | `POST /v1/accounts` | 201 | 15 | `qa-2cd9fdd2-06f6-43f6-86a7-5b29d670f930` |
| 3 | `POST /v1/auth/token` | 200 | 38 | `qa-bde18745-d95e-45bb-9c9e-f9b1758611c9` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-eea1eedb-13a2-4b5b-8465-246066beda1d` |
| 5 | `POST /v1/conversations/{id}/messages` | 415 | 30 | `qa-a64c0117-738b-476e-ba12-06597f54ccc8` |
| 6 | `POST /v1/auth/token` | 200 | 37 | `qa-1d7c4332-42a8-417d-9bf5-368b098f5d1a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-f34a4e2f-367f-4a2b-a6c9-58e29b326921` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-bdfa46a2-ec9e-4fd3-bab3-5f5e316d19b9` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-eac907ab-4567-492f-a336-b47fea3b3025` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-3802dcb2-ce49-45f6-b892-c5f45ccf1dd2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a8b42eef-d775-46d6-9757-e39706c67b85

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8b42eef-d775-46d6-9757-e39706c67b85
Content-Type: application/json

--- request body ---
{"handle":"qa-2761caddb35b","displayName":"QA 2761caddb35b","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8b42eef-d775-46d6-9757-e39706c67b85
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 347
RateLimit-Reset: 6
Location: /v1/accounts/qa-2761caddb35b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6ac6751c-e365-4622-b439-325c424e0752","handle":"qa-2761caddb35b","displayName":"QA 2761caddb35b","region":"eu","role":"user","createdAt":"2026-11-20T10:10:03.477139301Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2cd9fdd2-06f6-43f6-86a7-5b29d670f930

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2cd9fdd2-06f6-43f6-86a7-5b29d670f930
Content-Type: application/json

--- request body ---
{"handle":"qa-ce1f75e58dec","displayName":"QA ce1f75e58dec","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-2cd9fdd2-06f6-43f6-86a7-5b29d670f930
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 341
RateLimit-Reset: 6
Location: /v1/accounts/qa-ce1f75e58dec
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d9ff1243-d50e-4ce0-b48d-20830827ff7c","handle":"qa-ce1f75e58dec","displayName":"QA ce1f75e58dec","region":"eu","role":"user","createdAt":"2026-11-20T10:10:03.508023706Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-bde18745-d95e-45bb-9c9e-f9b1758611c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bde18745-d95e-45bb-9c9e-f9b1758611c9
Content-Type: application/json

--- request body ---
{"handle":"qa-2761caddb35b","password":"****"}

--- response: 200 in 38 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-bde18745-d95e-45bb-9c9e-f9b1758611c9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 338
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6ac6751c-e365-4622-b439-325c424e0752"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-eea1eedb-13a2-4b5b-8465-246066beda1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eea1eedb-13a2-4b5b-8465-246066beda1d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ce1f75e58dec","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-eea1eedb-13a2-4b5b-8465-246066beda1d
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
Location: /v1/conversations/cnv_17fae158-cd9f-40f4-ae93-9c488cd90469
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_17fae158-cd9f-40f4-ae93-9c488cd90469","subject":"Error contract","status":"open","region":"eu","participants":["qa-2761caddb35b","qa-ce1f75e58dec"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:03.574329216Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_17fae158-cd9f-40f4-ae93-9c488cd90469/messages
correlation: qa-a64c0117-738b-476e-ba12-06597f54ccc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a64c0117-738b-476e-ba12-06597f54ccc8
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 30 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a64c0117-738b-476e-ba12-06597f54ccc8
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
Content-Length: 307

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations/cnv_17fae158-cd9f-40f4-ae93-9c488cd90469/messages","correlationId":"qa-a64c0117-738b-476e-ba12-06597f54ccc8"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1d7c4332-42a8-417d-9bf5-368b098f5d1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d7c4332-42a8-417d-9bf5-368b098f5d1a
Content-Type: application/json

--- request body ---
{"handle":"qa-ce1f75e58dec","password":"****"}

--- response: 200 in 37 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d7c4332-42a8-417d-9bf5-368b098f5d1a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 327
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d9ff1243-d50e-4ce0-b48d-20830827ff7c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f34a4e2f-367f-4a2b-a6c9-58e29b326921

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f34a4e2f-367f-4a2b-a6c9-58e29b326921
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f34a4e2f-367f-4a2b-a6c9-58e29b326921
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
correlation: qa-bdfa46a2-ec9e-4fd3-bab3-5f5e316d19b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bdfa46a2-ec9e-4fd3-bab3-5f5e316d19b9
Content-Type: application/json

--- request body ---
{"handle":"qa-ce1f75e58dec","password":"****"}

--- response: 401 in 14 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bdfa46a2-ec9e-4fd3-bab3-5f5e316d19b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 322
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bdfa46a2-ec9e-4fd3-bab3-5f5e316d19b9"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-eac907ab-4567-492f-a336-b47fea3b3025

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eac907ab-4567-492f-a336-b47fea3b3025
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-eac907ab-4567-492f-a336-b47fea3b3025
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
correlation: qa-3802dcb2-ce49-45f6-b892-c5f45ccf1dd2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3802dcb2-ce49-45f6-b892-c5f45ccf1dd2
Content-Type: application/json

--- request body ---
{"handle":"qa-2761caddb35b","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3802dcb2-ce49-45f6-b892-c5f45ccf1dd2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 315
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3802dcb2-ce49-45f6-b892-c5f45ccf1dd2"}
```

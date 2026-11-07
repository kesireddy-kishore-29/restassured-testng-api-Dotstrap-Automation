# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 403 | `qa-4ebcb5e8-4cc0-4e91-adde-b295bd84dcf8` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-5abe8159-3195-4f26-b3ca-1c914b07eda7` |
| 3 | `POST /v1/auth/token` | 200 | 68 | `qa-b8613d1e-45a4-4087-8f0f-6e4671b7e923` |
| 4 | `POST /v1/conversations` | 201 | 58 | `qa-6f53cdd1-5bde-4cba-9168-0f53c3d64dae` |
| 5 | `POST /v1/auth/token` | 415 | 55 | `qa-d73a95eb-0b11-485f-abb8-54fc2c601c35` |
| 6 | `POST /v1/auth/token` | 200 | 37 | `qa-cbfa26d0-8aa3-44b1-a13f-ad08bf723fe9` |
| 7 | `DELETE /v1/accounts/me` | 204 | 33 | `qa-714afa72-6bf6-4636-adab-8a25bce12f82` |
| 8 | `POST /v1/auth/token` | 401 | 78 | `qa-3910bbbd-2308-48c5-9e3f-39b800584808` |
| 9 | `DELETE /v1/accounts/me` | 204 | 41 | `qa-213c2b22-6c8e-46b4-936b-909a53d388a6` |
| 10 | `POST /v1/auth/token` | 401 | 38 | `qa-dcd5b1c6-5df4-4997-b292-5a21fd3983fd` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4ebcb5e8-4cc0-4e91-adde-b295bd84dcf8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ebcb5e8-4cc0-4e91-adde-b295bd84dcf8
Content-Type: application/json

--- request body ---
{"handle":"qa-09943c80cdf3","displayName":"QA 09943c80cdf3","password":"****","region":"eu"}

--- response: 201 in 403 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ebcb5e8-4cc0-4e91-adde-b295bd84dcf8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Location: /v1/accounts/qa-09943c80cdf3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_795d17a8-da2f-48e7-bc4a-48bf51df4744","handle":"qa-09943c80cdf3","displayName":"QA 09943c80cdf3","region":"eu","role":"user","createdAt":"2026-11-01T09:23:20.342141873Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5abe8159-3195-4f26-b3ca-1c914b07eda7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5abe8159-3195-4f26-b3ca-1c914b07eda7
Content-Type: application/json

--- request body ---
{"handle":"qa-0f9157d8aec9","displayName":"QA 0f9157d8aec9","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-5abe8159-3195-4f26-b3ca-1c914b07eda7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Location: /v1/accounts/qa-0f9157d8aec9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cb0a829d-835c-4175-adc2-98366cb0ce3c","handle":"qa-0f9157d8aec9","displayName":"QA 0f9157d8aec9","region":"eu","role":"user","createdAt":"2026-11-01T09:23:20.766755505Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b8613d1e-45a4-4087-8f0f-6e4671b7e923

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8613d1e-45a4-4087-8f0f-6e4671b7e923
Content-Type: application/json

--- request body ---
{"handle":"qa-09943c80cdf3","password":"****"}

--- response: 200 in 68 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-b8613d1e-45a4-4087-8f0f-6e4671b7e923
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_795d17a8-da2f-48e7-bc4a-48bf51df4744"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6f53cdd1-5bde-4cba-9168-0f53c3d64dae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f53cdd1-5bde-4cba-9168-0f53c3d64dae
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0f9157d8aec9","subject":"Error contract","message":"Hi"}

--- response: 201 in 58 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f53cdd1-5bde-4cba-9168-0f53c3d64dae
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
Location: /v1/conversations/cnv_919c7973-830b-439c-828e-708129b78c9e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_919c7973-830b-439c-828e-708129b78c9e","subject":"Error contract","status":"open","region":"eu","participants":["qa-09943c80cdf3","qa-0f9157d8aec9"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:20.993070884Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-d73a95eb-0b11-485f-abb8-54fc2c601c35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d73a95eb-0b11-485f-abb8-54fc2c601c35
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 55 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d73a95eb-0b11-485f-abb8-54fc2c601c35
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 550
RateLimit-Reset: 10
Content-Length: 254

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/auth/token","correlationId":"qa-d73a95eb-0b11-485f-abb8-54fc2c601c35"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-cbfa26d0-8aa3-44b1-a13f-ad08bf723fe9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbfa26d0-8aa3-44b1-a13f-ad08bf723fe9
Content-Type: application/json

--- request body ---
{"handle":"qa-0f9157d8aec9","password":"****"}

--- response: 200 in 37 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-cbfa26d0-8aa3-44b1-a13f-ad08bf723fe9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 541
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cb0a829d-835c-4175-adc2-98366cb0ce3c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-714afa72-6bf6-4636-adab-8a25bce12f82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-714afa72-6bf6-4636-adab-8a25bce12f82
Content-Type: application/json

--- response: 204 in 33 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: text/plain
X-Correlation-Id: qa-714afa72-6bf6-4636-adab-8a25bce12f82
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
correlation: qa-3910bbbd-2308-48c5-9e3f-39b800584808

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3910bbbd-2308-48c5-9e3f-39b800584808
Content-Type: application/json

--- request body ---
{"handle":"qa-0f9157d8aec9","password":"****"}

--- response: 401 in 78 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3910bbbd-2308-48c5-9e3f-39b800584808
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 525
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3910bbbd-2308-48c5-9e3f-39b800584808"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-213c2b22-6c8e-46b4-936b-909a53d388a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-213c2b22-6c8e-46b4-936b-909a53d388a6
Content-Type: application/json

--- response: 204 in 41 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-213c2b22-6c8e-46b4-936b-909a53d388a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-dcd5b1c6-5df4-4997-b292-5a21fd3983fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dcd5b1c6-5df4-4997-b292-5a21fd3983fd
Content-Type: application/json

--- request body ---
{"handle":"qa-09943c80cdf3","password":"****"}

--- response: 401 in 38 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dcd5b1c6-5df4-4997-b292-5a21fd3983fd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 516
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dcd5b1c6-5df4-4997-b292-5a21fd3983fd"}
```

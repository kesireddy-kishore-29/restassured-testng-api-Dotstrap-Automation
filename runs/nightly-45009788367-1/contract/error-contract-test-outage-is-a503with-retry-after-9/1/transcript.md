# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[9]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-0489002c-171a-47af-ae09-761433156316` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-8d298c72-acfe-47d6-8ef1-927985ac956b` |
| 3 | `POST /v1/auth/token` | 200 | 11 | `qa-0a81c346-e781-4cdf-a91d-75518ed6f5ef` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-71e5ade9-3256-4630-91ed-490b99d95b64` |
| 5 | `GET /v1/conversations/{id}/messages` | 503 | 16 | `qa-fcf72c75-24ac-4f65-9406-6cad11d94289` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-10cc8342-c6f4-462e-85a2-d9a24eb43e63` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-c8a0bb9f-3b8b-43ca-8dde-f8b0142bed19` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-6328617c-ba30-4f49-96f4-ff2fe2e150c7` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-27adab8f-cb92-4553-8715-a31faab9b99b` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-5f6ed982-aaef-445f-a09d-ee33c718e8c2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0489002c-171a-47af-ae09-761433156316

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0489002c-171a-47af-ae09-761433156316
Content-Type: application/json

--- request body ---
{"handle":"qa-8113c07aa728","displayName":"QA 8113c07aa728","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-0489002c-171a-47af-ae09-761433156316
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 411
RateLimit-Reset: 8
Location: /v1/accounts/qa-8113c07aa728
X-Served-Region: eu
Content-Length: 181

{"id":"acc_21f34d3b-3bbf-4846-a4e4-f9fd8fd42ece","handle":"qa-8113c07aa728","displayName":"QA 8113c07aa728","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.732647705Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8d298c72-acfe-47d6-8ef1-927985ac956b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d298c72-acfe-47d6-8ef1-927985ac956b
Content-Type: application/json

--- request body ---
{"handle":"qa-25352d8afccd","displayName":"QA 25352d8afccd","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d298c72-acfe-47d6-8ef1-927985ac956b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 406
RateLimit-Reset: 8
Location: /v1/accounts/qa-25352d8afccd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4f28c828-3563-4ba7-ae8d-77eee86c6854","handle":"qa-25352d8afccd","displayName":"QA 25352d8afccd","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.761795964Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0a81c346-e781-4cdf-a91d-75518ed6f5ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a81c346-e781-4cdf-a91d-75518ed6f5ef
Content-Type: application/json

--- request body ---
{"handle":"qa-8113c07aa728","password":"****"}

--- response: 200 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a81c346-e781-4cdf-a91d-75518ed6f5ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 398
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_21f34d3b-3bbf-4846-a4e4-f9fd8fd42ece"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-71e5ade9-3256-4630-91ed-490b99d95b64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71e5ade9-3256-4630-91ed-490b99d95b64
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-25352d8afccd","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-71e5ade9-3256-4630-91ed-490b99d95b64
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
Location: /v1/conversations/cnv_6f5fd002-7870-420e-aa0a-d940982fb053
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6f5fd002-7870-420e-aa0a-d940982fb053","subject":"Error contract","status":"open","region":"eu","participants":["qa-8113c07aa728","qa-25352d8afccd"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:41.806343356Z"}
```

## 5. GET /v1/conversations/{id}/messages

```text
#5 GET http://localhost:7070/v1/conversations/cnv_6f5fd002-7870-420e-aa0a-d940982fb053/messages
correlation: qa-fcf72c75-24ac-4f65-9406-6cad11d94289

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 1ea9e91f-c52e-41c7-8d1a-7526268eba58
X-Correlation-Id: qa-fcf72c75-24ac-4f65-9406-6cad11d94289
Content-Type: application/json

--- response: 503 in 16 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fcf72c75-24ac-4f65-9406-6cad11d94289
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_6f5fd002-7870-420e-aa0a-d940982fb053/messages","correlationId":"qa-fcf72c75-24ac-4f65-9406-6cad11d94289"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-10cc8342-c6f4-462e-85a2-d9a24eb43e63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10cc8342-c6f4-462e-85a2-d9a24eb43e63
Content-Type: application/json

--- request body ---
{"handle":"qa-25352d8afccd","password":"****"}

--- response: 200 in 33 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-10cc8342-c6f4-462e-85a2-d9a24eb43e63
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 387
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4f28c828-3563-4ba7-ae8d-77eee86c6854"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c8a0bb9f-3b8b-43ca-8dde-f8b0142bed19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8a0bb9f-3b8b-43ca-8dde-f8b0142bed19
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c8a0bb9f-3b8b-43ca-8dde-f8b0142bed19
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
correlation: qa-6328617c-ba30-4f49-96f4-ff2fe2e150c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6328617c-ba30-4f49-96f4-ff2fe2e150c7
Content-Type: application/json

--- request body ---
{"handle":"qa-25352d8afccd","password":"****"}

--- response: 401 in 13 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6328617c-ba30-4f49-96f4-ff2fe2e150c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 376
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6328617c-ba30-4f49-96f4-ff2fe2e150c7"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-27adab8f-cb92-4553-8715-a31faab9b99b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27adab8f-cb92-4553-8715-a31faab9b99b
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-27adab8f-cb92-4553-8715-a31faab9b99b
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-5f6ed982-aaef-445f-a09d-ee33c718e8c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f6ed982-aaef-445f-a09d-ee33c718e8c2
Content-Type: application/json

--- request body ---
{"handle":"qa-8113c07aa728","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5f6ed982-aaef-445f-a09d-ee33c718e8c2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 371
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5f6ed982-aaef-445f-a09d-ee33c718e8c2"}
```

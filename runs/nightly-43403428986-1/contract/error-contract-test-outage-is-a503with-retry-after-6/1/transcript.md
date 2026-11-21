# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[6]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 45 | `qa-1418d15e-0f1a-4223-83b9-df042bcde15e` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-8c503cf4-19df-468a-8fb8-a968285dd810` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-fd2cb5be-45ee-4681-9086-ab974f8f3434` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-cac5696c-1c82-4e5f-840c-1fc35a604180` |
| 5 | `POST /v1/conversations` | 503 | 26 | `qa-69aab623-8f75-4853-a4c4-b3261aa10c96` |
| 6 | `POST /v1/auth/token` | 200 | 45 | `qa-2c2e6ed7-ffee-4d05-8d8d-7ef1cc17f8ab` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-8ab0b6f9-9488-47b5-8d60-6a27ec9fa025` |
| 8 | `POST /v1/auth/token` | 401 | 21 | `qa-8bf1eaec-4db9-4456-9381-49a5f7075e9d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-d7502763-bcaf-4f8f-b38a-aa249a91c1e4` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-f9578f2d-4cfb-47f8-a6bf-94fcd402269f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1418d15e-0f1a-4223-83b9-df042bcde15e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1418d15e-0f1a-4223-83b9-df042bcde15e
Content-Type: application/json

--- request body ---
{"handle":"qa-a380ed6dadfb","displayName":"QA a380ed6dadfb","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-1418d15e-0f1a-4223-83b9-df042bcde15e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 480
RateLimit-Reset: 8
Location: /v1/accounts/qa-a380ed6dadfb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f82973b3-fd1c-4944-92b4-42bbdc5aef5e","handle":"qa-a380ed6dadfb","displayName":"QA a380ed6dadfb","region":"eu","role":"user","createdAt":"2026-11-13T09:42:06.999721308Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8c503cf4-19df-468a-8fb8-a968285dd810

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c503cf4-19df-468a-8fb8-a968285dd810
Content-Type: application/json

--- request body ---
{"handle":"qa-b7ef9113b705","displayName":"QA b7ef9113b705","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c503cf4-19df-468a-8fb8-a968285dd810
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 469
RateLimit-Reset: 8
Location: /v1/accounts/qa-b7ef9113b705
X-Served-Region: eu
Content-Length: 181

{"id":"acc_439710f1-c4e4-48a3-86f6-9a9af9fd7885","handle":"qa-b7ef9113b705","displayName":"QA b7ef9113b705","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.058366011Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-fd2cb5be-45ee-4681-9086-ab974f8f3434

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd2cb5be-45ee-4681-9086-ab974f8f3434
Content-Type: application/json

--- request body ---
{"handle":"qa-a380ed6dadfb","password":"****"}

--- response: 200 in 36 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd2cb5be-45ee-4681-9086-ab974f8f3434
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 458
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f82973b3-fd1c-4944-92b4-42bbdc5aef5e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-cac5696c-1c82-4e5f-840c-1fc35a604180

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cac5696c-1c82-4e5f-840c-1fc35a604180
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b7ef9113b705","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-cac5696c-1c82-4e5f-840c-1fc35a604180
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
Location: /v1/conversations/cnv_c6b5f629-e841-485f-b836-7d006415fc20
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c6b5f629-e841-485f-b836-7d006415fc20","subject":"Error contract","status":"open","region":"eu","participants":["qa-a380ed6dadfb","qa-b7ef9113b705"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:07.170775524Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-69aab623-8f75-4853-a4c4-b3261aa10c96

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 34055b59-3b26-4ef2-abcf-3d5b82ffedd5
X-Correlation-Id: qa-69aab623-8f75-4853-a4c4-b3261aa10c96
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a380ed6dadfb","subject":"Probe","message":"Hi"}

--- response: 503 in 26 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-69aab623-8f75-4853-a4c4-b3261aa10c96
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-69aab623-8f75-4853-a4c4-b3261aa10c96"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2c2e6ed7-ffee-4d05-8d8d-7ef1cc17f8ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c2e6ed7-ffee-4d05-8d8d-7ef1cc17f8ab
Content-Type: application/json

--- request body ---
{"handle":"qa-b7ef9113b705","password":"****"}

--- response: 200 in 45 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c2e6ed7-ffee-4d05-8d8d-7ef1cc17f8ab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 433
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_439710f1-c4e4-48a3-86f6-9a9af9fd7885"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8ab0b6f9-9488-47b5-8d60-6a27ec9fa025

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ab0b6f9-9488-47b5-8d60-6a27ec9fa025
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8ab0b6f9-9488-47b5-8d60-6a27ec9fa025
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
correlation: qa-8bf1eaec-4db9-4456-9381-49a5f7075e9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bf1eaec-4db9-4456-9381-49a5f7075e9d
Content-Type: application/json

--- request body ---
{"handle":"qa-b7ef9113b705","password":"****"}

--- response: 401 in 21 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8bf1eaec-4db9-4456-9381-49a5f7075e9d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 424
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8bf1eaec-4db9-4456-9381-49a5f7075e9d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d7502763-bcaf-4f8f-b38a-aa249a91c1e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7502763-bcaf-4f8f-b38a-aa249a91c1e4
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d7502763-bcaf-4f8f-b38a-aa249a91c1e4
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
correlation: qa-f9578f2d-4cfb-47f8-a6bf-94fcd402269f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9578f2d-4cfb-47f8-a6bf-94fcd402269f
Content-Type: application/json

--- request body ---
{"handle":"qa-a380ed6dadfb","password":"****"}

--- response: 401 in 14 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f9578f2d-4cfb-47f8-a6bf-94fcd402269f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 412
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f9578f2d-4cfb-47f8-a6bf-94fcd402269f"}
```

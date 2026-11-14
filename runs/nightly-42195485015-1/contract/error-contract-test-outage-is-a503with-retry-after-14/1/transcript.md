# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/ledger]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[14]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-dd6b0218-e112-4a8f-bb8e-d89c7623e7eb` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-0f664d06-eb5d-4a46-95d4-8f64b40c5a5e` |
| 3 | `POST /v1/auth/token` | 200 | 49 | `qa-7988b606-d326-4aad-bc60-6965ea379b87` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-0b31324d-0cdf-4631-a166-6fbbc6d8e6d2` |
| 5 | `GET /v1/credits/ledger` | 503 | 13 | `qa-fb88f82e-3a7a-44e5-8528-270b4140d00a` |
| 6 | `POST /v1/auth/token` | 200 | 63 | `qa-b9844e89-f943-442f-82c4-0ef09f9899d1` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-49e82719-ffaf-4228-ab19-ff16aad18083` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-e21d3157-44cc-4b3a-adb4-273cbe4a39ac` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-7bcfd271-100b-4a8c-894c-4b22f2cc4481` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-882dd212-5377-48b4-ae87-47b0ed9c635f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-dd6b0218-e112-4a8f-bb8e-d89c7623e7eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd6b0218-e112-4a8f-bb8e-d89c7623e7eb
Content-Type: application/json

--- request body ---
{"handle":"qa-df7b856bcd63","displayName":"QA df7b856bcd63","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd6b0218-e112-4a8f-bb8e-d89c7623e7eb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 361
RateLimit-Reset: 6
Location: /v1/accounts/qa-df7b856bcd63
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0e9ff999-07a2-4663-8781-0ad07caf4505","handle":"qa-df7b856bcd63","displayName":"QA df7b856bcd63","region":"eu","role":"user","createdAt":"2026-11-06T09:30:34.152656606Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0f664d06-eb5d-4a46-95d4-8f64b40c5a5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f664d06-eb5d-4a46-95d4-8f64b40c5a5e
Content-Type: application/json

--- request body ---
{"handle":"qa-b95a2360ad9e","displayName":"QA b95a2360ad9e","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f664d06-eb5d-4a46-95d4-8f64b40c5a5e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 353
RateLimit-Reset: 6
Location: /v1/accounts/qa-b95a2360ad9e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2784b1fd-378b-45d0-9a56-b75dc109050f","handle":"qa-b95a2360ad9e","displayName":"QA b95a2360ad9e","region":"eu","role":"user","createdAt":"2026-11-06T09:30:34.194297451Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7988b606-d326-4aad-bc60-6965ea379b87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7988b606-d326-4aad-bc60-6965ea379b87
Content-Type: application/json

--- request body ---
{"handle":"qa-df7b856bcd63","password":"****"}

--- response: 200 in 49 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-7988b606-d326-4aad-bc60-6965ea379b87
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0e9ff999-07a2-4663-8781-0ad07caf4505"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0b31324d-0cdf-4631-a166-6fbbc6d8e6d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b31324d-0cdf-4631-a166-6fbbc6d8e6d2
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b95a2360ad9e","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b31324d-0cdf-4631-a166-6fbbc6d8e6d2
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
Location: /v1/conversations/cnv_f1563f65-1362-4fa5-b353-f4dbf48e770c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f1563f65-1362-4fa5-b353-f4dbf48e770c","subject":"Error contract","status":"open","region":"eu","participants":["qa-df7b856bcd63","qa-b95a2360ad9e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:34.317430563Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-fb88f82e-3a7a-44e5-8528-270b4140d00a

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: d037c978-b47a-425d-85f0-fc6f8ba09df5
X-Correlation-Id: qa-fb88f82e-3a7a-44e5-8528-270b4140d00a
Content-Type: application/json

--- response: 503 in 13 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fb88f82e-3a7a-44e5-8528-270b4140d00a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 262

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/ledger","correlationId":"qa-fb88f82e-3a7a-44e5-8528-270b4140d00a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b9844e89-f943-442f-82c4-0ef09f9899d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9844e89-f943-442f-82c4-0ef09f9899d1
Content-Type: application/json

--- request body ---
{"handle":"qa-b95a2360ad9e","password":"****"}

--- response: 200 in 63 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9844e89-f943-442f-82c4-0ef09f9899d1
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2784b1fd-378b-45d0-9a56-b75dc109050f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-49e82719-ffaf-4228-ab19-ff16aad18083

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49e82719-ffaf-4228-ab19-ff16aad18083
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-49e82719-ffaf-4228-ab19-ff16aad18083
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
correlation: qa-e21d3157-44cc-4b3a-adb4-273cbe4a39ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e21d3157-44cc-4b3a-adb4-273cbe4a39ac
Content-Type: application/json

--- request body ---
{"handle":"qa-b95a2360ad9e","password":"****"}

--- response: 401 in 9 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e21d3157-44cc-4b3a-adb4-273cbe4a39ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 331
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e21d3157-44cc-4b3a-adb4-273cbe4a39ac"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7bcfd271-100b-4a8c-894c-4b22f2cc4481

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7bcfd271-100b-4a8c-894c-4b22f2cc4481
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7bcfd271-100b-4a8c-894c-4b22f2cc4481
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
correlation: qa-882dd212-5377-48b4-ae87-47b0ed9c635f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-882dd212-5377-48b4-ae87-47b0ed9c635f
Content-Type: application/json

--- request body ---
{"handle":"qa-df7b856bcd63","password":"****"}

--- response: 401 in 14 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-882dd212-5377-48b4-ae87-47b0ed9c635f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 326
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-882dd212-5377-48b4-ae87-47b0ed9c635f"}
```

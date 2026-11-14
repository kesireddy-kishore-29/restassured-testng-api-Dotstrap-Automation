# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/auth/token]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[0]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-4f164463-9471-4824-aa35-1e9e679a3f68` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-ac8df889-08da-4069-a054-324bf9910626` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-394e7510-ec44-4bbc-80a3-1f3e62ab69b3` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-6c2a90cb-1c3f-449b-9824-20bd4eb68bbf` |
| 5 | `POST /v1/auth/token` | 503 | 35 | `qa-a8ad4d51-2219-44a1-a036-9798dca33a45` |
| 6 | `POST /v1/auth/token` | 200 | 32 | `qa-66d340b4-3d8d-448e-bc00-7dbb0083472e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 34 | `qa-88d33999-6704-45e4-9eb0-a56567e3ff49` |
| 8 | `POST /v1/auth/token` | 401 | 31 | `qa-74838042-16fc-436b-b147-dd4e66fe8477` |
| 9 | `DELETE /v1/accounts/me` | 204 | 49 | `qa-0d875035-de60-4e3c-aaf3-9792d42465e1` |
| 10 | `POST /v1/auth/token` | 401 | 37 | `qa-f0a1f337-13fd-42c3-8b0b-5725d1dd789d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4f164463-9471-4824-aa35-1e9e679a3f68

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f164463-9471-4824-aa35-1e9e679a3f68
Content-Type: application/json

--- request body ---
{"handle":"qa-24b30ceb86e0","displayName":"QA 24b30ceb86e0","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-4f164463-9471-4824-aa35-1e9e679a3f68
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
Location: /v1/accounts/qa-24b30ceb86e0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f08f3f08-d6c3-49fe-8543-2f67386818ac","handle":"qa-24b30ceb86e0","displayName":"QA 24b30ceb86e0","region":"eu","role":"user","createdAt":"2026-11-10T09:59:35.116446928Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ac8df889-08da-4069-a054-324bf9910626

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac8df889-08da-4069-a054-324bf9910626
Content-Type: application/json

--- request body ---
{"handle":"qa-f40fd4060cd4","displayName":"QA f40fd4060cd4","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac8df889-08da-4069-a054-324bf9910626
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 10
Location: /v1/accounts/qa-f40fd4060cd4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9492b7ec-08b1-49ac-871e-8607def5369c","handle":"qa-f40fd4060cd4","displayName":"QA f40fd4060cd4","region":"eu","role":"user","createdAt":"2026-11-10T09:59:35.152082824Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-394e7510-ec44-4bbc-80a3-1f3e62ab69b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-394e7510-ec44-4bbc-80a3-1f3e62ab69b3
Content-Type: application/json

--- request body ---
{"handle":"qa-24b30ceb86e0","password":"****"}

--- response: 200 in 28 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-394e7510-ec44-4bbc-80a3-1f3e62ab69b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 555
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f08f3f08-d6c3-49fe-8543-2f67386818ac"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6c2a90cb-1c3f-449b-9824-20bd4eb68bbf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c2a90cb-1c3f-449b-9824-20bd4eb68bbf
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f40fd4060cd4","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c2a90cb-1c3f-449b-9824-20bd4eb68bbf
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
Location: /v1/conversations/cnv_1b44f5f6-36fb-4fbe-9c47-ca77e49c9304
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1b44f5f6-36fb-4fbe-9c47-ca77e49c9304","subject":"Error contract","status":"open","region":"eu","participants":["qa-24b30ceb86e0","qa-f40fd4060cd4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:35.220583360Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-a8ad4d51-2219-44a1-a036-9798dca33a45

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: d274ffb2-5c7f-4aa0-9f45-4097ff40a07a
X-Correlation-Id: qa-a8ad4d51-2219-44a1-a036-9798dca33a45
Content-Type: application/json

--- request body ---
{"handle":"qa-24b30ceb86e0","password":"****"}

--- response: 503 in 35 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a8ad4d51-2219-44a1-a036-9798dca33a45
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 258

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/auth/token","correlationId":"qa-a8ad4d51-2219-44a1-a036-9798dca33a45"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-66d340b4-3d8d-448e-bc00-7dbb0083472e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66d340b4-3d8d-448e-bc00-7dbb0083472e
Content-Type: application/json

--- request body ---
{"handle":"qa-f40fd4060cd4","password":"****"}

--- response: 200 in 32 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-66d340b4-3d8d-448e-bc00-7dbb0083472e
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9492b7ec-08b1-49ac-871e-8607def5369c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-88d33999-6704-45e4-9eb0-a56567e3ff49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88d33999-6704-45e4-9eb0-a56567e3ff49
Content-Type: application/json

--- response: 204 in 34 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-88d33999-6704-45e4-9eb0-a56567e3ff49
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
correlation: qa-74838042-16fc-436b-b147-dd4e66fe8477

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74838042-16fc-436b-b147-dd4e66fe8477
Content-Type: application/json

--- request body ---
{"handle":"qa-f40fd4060cd4","password":"****"}

--- response: 401 in 31 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-74838042-16fc-436b-b147-dd4e66fe8477
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 500
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-74838042-16fc-436b-b147-dd4e66fe8477"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0d875035-de60-4e3c-aaf3-9792d42465e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d875035-de60-4e3c-aaf3-9792d42465e1
Content-Type: application/json

--- response: 204 in 49 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0d875035-de60-4e3c-aaf3-9792d42465e1
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
correlation: qa-f0a1f337-13fd-42c3-8b0b-5725d1dd789d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0a1f337-13fd-42c3-8b0b-5725d1dd789d
Content-Type: application/json

--- request body ---
{"handle":"qa-24b30ceb86e0","password":"****"}

--- response: 401 in 37 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f0a1f337-13fd-42c3-8b0b-5725d1dd789d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 487
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f0a1f337-13fd-42c3-8b0b-5725d1dd789d"}
```

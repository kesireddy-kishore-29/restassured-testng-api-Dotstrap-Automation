# Transcript: Every operation answers an outage with a 503 problem and Retry-After [DELETE /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[4]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 42 | `qa-ee55e978-f3c0-4015-b1ee-418b345d4910` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-777eb34d-69d9-4068-abec-6a30547e60f1` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-b6539df3-a474-4624-a135-d45a5f906ae0` |
| 4 | `POST /v1/conversations` | 201 | 29 | `qa-a2ca2eb7-289d-463e-9fb0-80108d294367` |
| 5 | `DELETE /v1/accounts/me` | 503 | 15 | `qa-55029d92-bed3-4317-bb17-a07ffa456062` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-e736fcbb-4cee-4d03-8cc4-e9f1ebb2ea74` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-0c66f27c-01b8-4a3b-a4f6-8d111c79077f` |
| 8 | `POST /v1/auth/token` | 401 | 30 | `qa-c87f6e00-999f-47e9-b24e-11e2098d8665` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-391eda22-9838-456d-8e0d-e7ed6936f133` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-99e142f1-04dc-41f1-b92e-b85ba99645d4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ee55e978-f3c0-4015-b1ee-418b345d4910

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee55e978-f3c0-4015-b1ee-418b345d4910
Content-Type: application/json

--- request body ---
{"handle":"qa-9b913771f37b","displayName":"QA 9b913771f37b","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee55e978-f3c0-4015-b1ee-418b345d4910
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 489
RateLimit-Reset: 8
Location: /v1/accounts/qa-9b913771f37b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b11f1486-22fb-4090-b7ef-ff2f49fe8181","handle":"qa-9b913771f37b","displayName":"QA 9b913771f37b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.362648933Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-777eb34d-69d9-4068-abec-6a30547e60f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-777eb34d-69d9-4068-abec-6a30547e60f1
Content-Type: application/json

--- request body ---
{"handle":"qa-78fd72d8ed3c","displayName":"QA 78fd72d8ed3c","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-777eb34d-69d9-4068-abec-6a30547e60f1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 479
RateLimit-Reset: 8
Location: /v1/accounts/qa-78fd72d8ed3c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4fdf9589-7e5f-42e9-aa98-7552714988e5","handle":"qa-78fd72d8ed3c","displayName":"QA 78fd72d8ed3c","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.398283015Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b6539df3-a474-4624-a135-d45a5f906ae0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6539df3-a474-4624-a135-d45a5f906ae0
Content-Type: application/json

--- request body ---
{"handle":"qa-9b913771f37b","password":"****"}

--- response: 200 in 22 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-b6539df3-a474-4624-a135-d45a5f906ae0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 461
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b11f1486-22fb-4090-b7ef-ff2f49fe8181"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a2ca2eb7-289d-463e-9fb0-80108d294367

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2ca2eb7-289d-463e-9fb0-80108d294367
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-78fd72d8ed3c","subject":"Error contract","message":"Hi"}

--- response: 201 in 29 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2ca2eb7-289d-463e-9fb0-80108d294367
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
Location: /v1/conversations/cnv_b0d5995c-e60e-407c-aeea-93122ea4af03
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b0d5995c-e60e-407c-aeea-93122ea4af03","subject":"Error contract","status":"open","region":"eu","participants":["qa-9b913771f37b","qa-78fd72d8ed3c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:09.537383822Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-55029d92-bed3-4317-bb17-a07ffa456062

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 71b3ab35-d118-4634-b771-c39e1587d56a
X-Correlation-Id: qa-55029d92-bed3-4317-bb17-a07ffa456062
Content-Type: application/json

--- response: 503 in 15 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-55029d92-bed3-4317-bb17-a07ffa456062
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-55029d92-bed3-4317-bb17-a07ffa456062"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e736fcbb-4cee-4d03-8cc4-e9f1ebb2ea74

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e736fcbb-4cee-4d03-8cc4-e9f1ebb2ea74
Content-Type: application/json

--- request body ---
{"handle":"qa-78fd72d8ed3c","password":"****"}

--- response: 200 in 30 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-e736fcbb-4cee-4d03-8cc4-e9f1ebb2ea74
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 443
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4fdf9589-7e5f-42e9-aa98-7552714988e5"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0c66f27c-01b8-4a3b-a4f6-8d111c79077f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c66f27c-01b8-4a3b-a4f6-8d111c79077f
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0c66f27c-01b8-4a3b-a4f6-8d111c79077f
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
correlation: qa-c87f6e00-999f-47e9-b24e-11e2098d8665

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c87f6e00-999f-47e9-b24e-11e2098d8665
Content-Type: application/json

--- request body ---
{"handle":"qa-78fd72d8ed3c","password":"****"}

--- response: 401 in 30 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c87f6e00-999f-47e9-b24e-11e2098d8665
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 437
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c87f6e00-999f-47e9-b24e-11e2098d8665"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-391eda22-9838-456d-8e0d-e7ed6936f133

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-391eda22-9838-456d-8e0d-e7ed6936f133
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-391eda22-9838-456d-8e0d-e7ed6936f133
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
correlation: qa-99e142f1-04dc-41f1-b92e-b85ba99645d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99e142f1-04dc-41f1-b92e-b85ba99645d4
Content-Type: application/json

--- request body ---
{"handle":"qa-9b913771f37b","password":"****"}

--- response: 401 in 13 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-99e142f1-04dc-41f1-b92e-b85ba99645d4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 431
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-99e142f1-04dc-41f1-b92e-b85ba99645d4"}
```

# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/{handle}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[5]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 49 | `qa-16b0eaa8-4aa5-48d7-8701-0c54a43a89bb` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-2b9e0d38-bff1-4bf6-a26d-c9c939cfdf3c` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-41cb4e03-ae1b-4b25-a7ff-25cf7b70ffb6` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-80b55a30-c5ef-43a8-9f2d-7c96970bf2b3` |
| 5 | `GET /v1/accounts/{handle}` | 503 | 26 | `qa-1c4b2072-77af-4aeb-9dd5-b3ef91475757` |
| 6 | `POST /v1/auth/token` | 200 | 31 | `qa-c790906c-5d45-4b98-b984-692e3e63fc35` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-2b4e5a47-8b91-431a-87bf-158bdd0982d3` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-fb7eb5f7-e807-4364-a173-c2df48150941` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-8c9fdb71-1c5a-417a-8dea-b9b28d70b2e5` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-e293e8f8-9fbf-4ae3-838d-88c5aa4e069a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-16b0eaa8-4aa5-48d7-8701-0c54a43a89bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16b0eaa8-4aa5-48d7-8701-0c54a43a89bb
Content-Type: application/json

--- request body ---
{"handle":"qa-f155a2705922","displayName":"QA f155a2705922","password":"****","region":"eu"}

--- response: 201 in 49 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-16b0eaa8-4aa5-48d7-8701-0c54a43a89bb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 482
RateLimit-Reset: 8
Location: /v1/accounts/qa-f155a2705922
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0d1105f1-7291-4013-b223-9cbff65c0bbf","handle":"qa-f155a2705922","displayName":"QA f155a2705922","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.576392452Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2b9e0d38-bff1-4bf6-a26d-c9c939cfdf3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b9e0d38-bff1-4bf6-a26d-c9c939cfdf3c
Content-Type: application/json

--- request body ---
{"handle":"qa-4c8b9b7594e4","displayName":"QA 4c8b9b7594e4","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b9e0d38-bff1-4bf6-a26d-c9c939cfdf3c
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
Location: /v1/accounts/qa-4c8b9b7594e4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a4e196e9-c617-4ff8-b7a3-4279141fd0d1","handle":"qa-4c8b9b7594e4","displayName":"QA 4c8b9b7594e4","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.642491264Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-41cb4e03-ae1b-4b25-a7ff-25cf7b70ffb6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41cb4e03-ae1b-4b25-a7ff-25cf7b70ffb6
Content-Type: application/json

--- request body ---
{"handle":"qa-f155a2705922","password":"****"}

--- response: 200 in 39 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-41cb4e03-ae1b-4b25-a7ff-25cf7b70ffb6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0d1105f1-7291-4013-b223-9cbff65c0bbf"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-80b55a30-c5ef-43a8-9f2d-7c96970bf2b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80b55a30-c5ef-43a8-9f2d-7c96970bf2b3
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4c8b9b7594e4","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-80b55a30-c5ef-43a8-9f2d-7c96970bf2b3
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
Location: /v1/conversations/cnv_a533ef49-f621-423f-b59f-71680fff7a15
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a533ef49-f621-423f-b59f-71680fff7a15","subject":"Error contract","status":"open","region":"eu","participants":["qa-f155a2705922","qa-4c8b9b7594e4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:25.721636244Z"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-f155a2705922
correlation: qa-1c4b2072-77af-4aeb-9dd5-b3ef91475757

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 353ddd3b-2acd-4063-8b28-416dc3e74e4e
X-Correlation-Id: qa-1c4b2072-77af-4aeb-9dd5-b3ef91475757
Content-Type: application/json

--- response: 503 in 26 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1c4b2072-77af-4aeb-9dd5-b3ef91475757
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 272

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/qa-f155a2705922","correlationId":"qa-1c4b2072-77af-4aeb-9dd5-b3ef91475757"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c790906c-5d45-4b98-b984-692e3e63fc35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c790906c-5d45-4b98-b984-692e3e63fc35
Content-Type: application/json

--- request body ---
{"handle":"qa-4c8b9b7594e4","password":"****"}

--- response: 200 in 31 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-c790906c-5d45-4b98-b984-692e3e63fc35
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 436
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a4e196e9-c617-4ff8-b7a3-4279141fd0d1"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2b4e5a47-8b91-431a-87bf-158bdd0982d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b4e5a47-8b91-431a-87bf-158bdd0982d3
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2b4e5a47-8b91-431a-87bf-158bdd0982d3
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
correlation: qa-fb7eb5f7-e807-4364-a173-c2df48150941

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb7eb5f7-e807-4364-a173-c2df48150941
Content-Type: application/json

--- request body ---
{"handle":"qa-4c8b9b7594e4","password":"****"}

--- response: 401 in 16 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fb7eb5f7-e807-4364-a173-c2df48150941
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 428
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fb7eb5f7-e807-4364-a173-c2df48150941"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8c9fdb71-1c5a-417a-8dea-b9b28d70b2e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c9fdb71-1c5a-417a-8dea-b9b28d70b2e5
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8c9fdb71-1c5a-417a-8dea-b9b28d70b2e5
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
correlation: qa-e293e8f8-9fbf-4ae3-838d-88c5aa4e069a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e293e8f8-9fbf-4ae3-838d-88c5aa4e069a
Content-Type: application/json

--- request body ---
{"handle":"qa-f155a2705922","password":"****"}

--- response: 401 in 8 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e293e8f8-9fbf-4ae3-838d-88c5aa4e069a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 425
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e293e8f8-9fbf-4ae3-838d-88c5aa4e069a"}
```

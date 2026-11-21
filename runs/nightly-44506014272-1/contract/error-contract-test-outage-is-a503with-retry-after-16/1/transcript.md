# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/admin/stats]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[16]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-902ae7ad-c559-4c2a-a4fa-f2d09c9c4168` |
| 2 | `POST /v1/accounts` | 201 | 46 | `qa-66b90062-ec09-4fe0-a2fb-f189cd577680` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-c3251019-b245-492d-b039-767c1fced94c` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-2249c007-e2c2-41a4-9d56-24e40f876668` |
| 5 | `GET /v1/admin/stats` | 503 | 26 | `qa-87c6f0d8-41c2-4ea4-8aac-e15699ff1249` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-89ce42fc-f5ee-4ba9-80f2-c92925a00b7a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-5f0f2e9d-d9f7-4ba9-9700-869ff44ef909` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-254ee420-3b45-41a7-be73-db0d566491e3` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-3ca51122-a918-4ff0-82ef-52ca85c732f0` |
| 10 | `POST /v1/auth/token` | 401 | 20 | `qa-0e78757d-5576-4092-a747-b612a0deebb9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-902ae7ad-c559-4c2a-a4fa-f2d09c9c4168

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-902ae7ad-c559-4c2a-a4fa-f2d09c9c4168
Content-Type: application/json

--- request body ---
{"handle":"qa-426c926183c7","displayName":"QA 426c926183c7","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-902ae7ad-c559-4c2a-a4fa-f2d09c9c4168
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 323
RateLimit-Reset: 5
Location: /v1/accounts/qa-426c926183c7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba270cbd-56b9-4e99-89b4-6300afe12f48","handle":"qa-426c926183c7","displayName":"QA 426c926183c7","region":"eu","role":"user","createdAt":"2026-11-19T10:29:27.381668337Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-66b90062-ec09-4fe0-a2fb-f189cd577680

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66b90062-ec09-4fe0-a2fb-f189cd577680
Content-Type: application/json

--- request body ---
{"handle":"qa-829763071f35","displayName":"QA 829763071f35","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-66b90062-ec09-4fe0-a2fb-f189cd577680
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 318
RateLimit-Reset: 5
Location: /v1/accounts/qa-829763071f35
X-Served-Region: eu
Content-Length: 181

{"id":"acc_051df156-2b7c-4b14-a0fa-d10cc2e674e8","handle":"qa-829763071f35","displayName":"QA 829763071f35","region":"eu","role":"user","createdAt":"2026-11-19T10:29:27.431095150Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c3251019-b245-492d-b039-767c1fced94c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3251019-b245-492d-b039-767c1fced94c
Content-Type: application/json

--- request body ---
{"handle":"qa-426c926183c7","password":"****"}

--- response: 200 in 27 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3251019-b245-492d-b039-767c1fced94c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 311
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ba270cbd-56b9-4e99-89b4-6300afe12f48"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2249c007-e2c2-41a4-9d56-24e40f876668

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2249c007-e2c2-41a4-9d56-24e40f876668
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-829763071f35","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-2249c007-e2c2-41a4-9d56-24e40f876668
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
Location: /v1/conversations/cnv_3558fb7e-7c07-4af3-9870-124070be5f23
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3558fb7e-7c07-4af3-9870-124070be5f23","subject":"Error contract","status":"open","region":"eu","participants":["qa-426c926183c7","qa-829763071f35"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:27.514788814Z"}
```

## 5. GET /v1/admin/stats

```text
#5 GET http://localhost:7070/v1/admin/stats
correlation: qa-87c6f0d8-41c2-4ea4-8aac-e15699ff1249

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: db783278-67c7-43ef-bad6-48a0cbe7c035
X-Correlation-Id: qa-87c6f0d8-41c2-4ea4-8aac-e15699ff1249
Content-Type: application/json

--- response: 503 in 26 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-87c6f0d8-41c2-4ea4-8aac-e15699ff1249
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/admin/stats","correlationId":"qa-87c6f0d8-41c2-4ea4-8aac-e15699ff1249"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-89ce42fc-f5ee-4ba9-80f2-c92925a00b7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89ce42fc-f5ee-4ba9-80f2-c92925a00b7a
Content-Type: application/json

--- request body ---
{"handle":"qa-829763071f35","password":"****"}

--- response: 200 in 18 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-89ce42fc-f5ee-4ba9-80f2-c92925a00b7a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 303
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_051df156-2b7c-4b14-a0fa-d10cc2e674e8"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5f0f2e9d-d9f7-4ba9-9700-869ff44ef909

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f0f2e9d-d9f7-4ba9-9700-869ff44ef909
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5f0f2e9d-d9f7-4ba9-9700-869ff44ef909
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
correlation: qa-254ee420-3b45-41a7-be73-db0d566491e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-254ee420-3b45-41a7-be73-db0d566491e3
Content-Type: application/json

--- request body ---
{"handle":"qa-829763071f35","password":"****"}

--- response: 401 in 20 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-254ee420-3b45-41a7-be73-db0d566491e3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 300
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-254ee420-3b45-41a7-be73-db0d566491e3"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3ca51122-a918-4ff0-82ef-52ca85c732f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ca51122-a918-4ff0-82ef-52ca85c732f0
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3ca51122-a918-4ff0-82ef-52ca85c732f0
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
correlation: qa-0e78757d-5576-4092-a747-b612a0deebb9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e78757d-5576-4092-a747-b612a0deebb9
Content-Type: application/json

--- request body ---
{"handle":"qa-426c926183c7","password":"****"}

--- response: 401 in 20 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0e78757d-5576-4092-a747-b612a0deebb9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 295
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0e78757d-5576-4092-a747-b612a0deebb9"}
```

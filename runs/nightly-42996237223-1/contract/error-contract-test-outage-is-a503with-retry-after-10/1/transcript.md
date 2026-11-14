# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[10]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-5bf75f0a-d100-4b03-a442-7b12bc896295` |
| 2 | `POST /v1/accounts` | 201 | 44 | `qa-2cd6a11b-ef69-425d-bf7b-d6eba49a6831` |
| 3 | `POST /v1/auth/token` | 200 | 47 | `qa-8fa6f450-9d7f-42b2-b1ca-f73272bf9cb5` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-8932dc7c-a408-4980-9d9c-311dbadfb538` |
| 5 | `POST /v1/conversations/{id}/messages` | 503 | 10 | `qa-fb9afca0-01b9-4650-b994-2781d5b0437b` |
| 6 | `POST /v1/auth/token` | 200 | 39 | `qa-a85b6c90-eea9-45a7-979f-011449921e7e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-d9aaf5bb-66d9-4ee3-bb90-d6a6e6756d7c` |
| 8 | `POST /v1/auth/token` | 401 | 21 | `qa-446938d3-c3ff-4e10-8ad1-5e404e53503e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-43e44d80-1ba8-43ea-b755-abf386dd873e` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-a5c0e901-5bf2-45cf-a43a-047d4088cfc0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5bf75f0a-d100-4b03-a442-7b12bc896295

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5bf75f0a-d100-4b03-a442-7b12bc896295
Content-Type: application/json

--- request body ---
{"handle":"qa-24f948933739","displayName":"QA 24f948933739","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-5bf75f0a-d100-4b03-a442-7b12bc896295
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 415
RateLimit-Reset: 7
Location: /v1/accounts/qa-24f948933739
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3467c5a0-66e6-4774-8d7a-1cc10835a225","handle":"qa-24f948933739","displayName":"QA 24f948933739","region":"eu","role":"user","createdAt":"2026-11-11T09:34:38.236286696Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2cd6a11b-ef69-425d-bf7b-d6eba49a6831

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2cd6a11b-ef69-425d-bf7b-d6eba49a6831
Content-Type: application/json

--- request body ---
{"handle":"qa-08ce0d3a0d3d","displayName":"QA 08ce0d3a0d3d","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-2cd6a11b-ef69-425d-bf7b-d6eba49a6831
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 408
RateLimit-Reset: 7
Location: /v1/accounts/qa-08ce0d3a0d3d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_18292c2e-b3aa-47b4-872b-f58effbb5176","handle":"qa-08ce0d3a0d3d","displayName":"QA 08ce0d3a0d3d","region":"eu","role":"user","createdAt":"2026-11-11T09:34:38.296255389Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8fa6f450-9d7f-42b2-b1ca-f73272bf9cb5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fa6f450-9d7f-42b2-b1ca-f73272bf9cb5
Content-Type: application/json

--- request body ---
{"handle":"qa-24f948933739","password":"****"}

--- response: 200 in 47 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-8fa6f450-9d7f-42b2-b1ca-f73272bf9cb5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 397
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3467c5a0-66e6-4774-8d7a-1cc10835a225"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8932dc7c-a408-4980-9d9c-311dbadfb538

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8932dc7c-a408-4980-9d9c-311dbadfb538
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-08ce0d3a0d3d","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-8932dc7c-a408-4980-9d9c-311dbadfb538
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
Location: /v1/conversations/cnv_db1d3bbd-7a05-484c-a924-4c717d0dad55
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_db1d3bbd-7a05-484c-a924-4c717d0dad55","subject":"Error contract","status":"open","region":"eu","participants":["qa-24f948933739","qa-08ce0d3a0d3d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:38.393271663Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_db1d3bbd-7a05-484c-a924-4c717d0dad55/messages
correlation: qa-fb9afca0-01b9-4650-b994-2781d5b0437b

--- request headers ---
Accept: application/json
X-Fault-Key: f7ce535a-a13a-409b-a489-ad93ae6aff22
X-Fault: unavailable-once
X-Correlation-Id: qa-fb9afca0-01b9-4650-b994-2781d5b0437b
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 503 in 10 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fb9afca0-01b9-4650-b994-2781d5b0437b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_db1d3bbd-7a05-484c-a924-4c717d0dad55/messages","correlationId":"qa-fb9afca0-01b9-4650-b994-2781d5b0437b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a85b6c90-eea9-45a7-979f-011449921e7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a85b6c90-eea9-45a7-979f-011449921e7e
Content-Type: application/json

--- request body ---
{"handle":"qa-08ce0d3a0d3d","password":"****"}

--- response: 200 in 39 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-a85b6c90-eea9-45a7-979f-011449921e7e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 385
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_18292c2e-b3aa-47b4-872b-f58effbb5176"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d9aaf5bb-66d9-4ee3-bb90-d6a6e6756d7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9aaf5bb-66d9-4ee3-bb90-d6a6e6756d7c
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d9aaf5bb-66d9-4ee3-bb90-d6a6e6756d7c
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
correlation: qa-446938d3-c3ff-4e10-8ad1-5e404e53503e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-446938d3-c3ff-4e10-8ad1-5e404e53503e
Content-Type: application/json

--- request body ---
{"handle":"qa-08ce0d3a0d3d","password":"****"}

--- response: 401 in 21 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-446938d3-c3ff-4e10-8ad1-5e404e53503e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 375
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-446938d3-c3ff-4e10-8ad1-5e404e53503e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-43e44d80-1ba8-43ea-b755-abf386dd873e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43e44d80-1ba8-43ea-b755-abf386dd873e
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-43e44d80-1ba8-43ea-b755-abf386dd873e
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
correlation: qa-a5c0e901-5bf2-45cf-a43a-047d4088cfc0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5c0e901-5bf2-45cf-a43a-047d4088cfc0
Content-Type: application/json

--- request body ---
{"handle":"qa-24f948933739","password":"****"}

--- response: 401 in 17 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a5c0e901-5bf2-45cf-a43a-047d4088cfc0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 367
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a5c0e901-5bf2-45cf-a43a-047d4088cfc0"}
```

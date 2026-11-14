# Transcript: Every operation answers an outage with a 503 problem and Retry-After [PATCH /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[3]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 37 | `qa-0da64d2f-e60a-4dc6-9cc9-bd6d0ea5e894` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-030a6b60-278f-4b86-bb6a-5a78bc345d5f` |
| 3 | `POST /v1/auth/token` | 200 | 42 | `qa-97dafd86-94e9-4078-86fc-7dbc0a08e631` |
| 4 | `POST /v1/conversations` | 201 | 25 | `qa-b1e2ec4e-807e-43a5-8038-61d831b0b97f` |
| 5 | `PATCH /v1/accounts/me` | 503 | 16 | `qa-e387edcb-3659-45d0-aa72-1d3af68f7a5c` |
| 6 | `POST /v1/auth/token` | 200 | 31 | `qa-1b0b3c3f-d225-4f77-a8ae-5304294e94c2` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-4830ab08-db2a-4a3d-948d-603350c45307` |
| 8 | `POST /v1/auth/token` | 401 | 24 | `qa-7c0cf0e4-d0ee-4f06-92a8-e400867ca090` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-c22e7465-07b1-4c8c-961b-231b6c35e00c` |
| 10 | `POST /v1/auth/token` | 401 | 34 | `qa-3d017550-02f3-4165-a6d6-fcb26aac92c0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0da64d2f-e60a-4dc6-9cc9-bd6d0ea5e894

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0da64d2f-e60a-4dc6-9cc9-bd6d0ea5e894
Content-Type: application/json

--- request body ---
{"handle":"qa-8ca889a280e9","displayName":"QA 8ca889a280e9","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-0da64d2f-e60a-4dc6-9cc9-bd6d0ea5e894
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Location: /v1/accounts/qa-8ca889a280e9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1eca62a0-d736-4190-8f18-d41901e95d90","handle":"qa-8ca889a280e9","displayName":"QA 8ca889a280e9","region":"eu","role":"user","createdAt":"2026-11-11T09:34:36.053877217Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-030a6b60-278f-4b86-bb6a-5a78bc345d5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-030a6b60-278f-4b86-bb6a-5a78bc345d5f
Content-Type: application/json

--- request body ---
{"handle":"qa-f2fb2be175cc","displayName":"QA f2fb2be175cc","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-030a6b60-278f-4b86-bb6a-5a78bc345d5f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 9
Location: /v1/accounts/qa-f2fb2be175cc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_55773652-2f3a-4a05-9c00-13eaa3f66ae8","handle":"qa-f2fb2be175cc","displayName":"QA f2fb2be175cc","region":"eu","role":"user","createdAt":"2026-11-11T09:34:36.103753702Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-97dafd86-94e9-4078-86fc-7dbc0a08e631

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97dafd86-94e9-4078-86fc-7dbc0a08e631
Content-Type: application/json

--- request body ---
{"handle":"qa-8ca889a280e9","password":"****"}

--- response: 200 in 42 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-97dafd86-94e9-4078-86fc-7dbc0a08e631
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 549
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1eca62a0-d736-4190-8f18-d41901e95d90"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b1e2ec4e-807e-43a5-8038-61d831b0b97f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1e2ec4e-807e-43a5-8038-61d831b0b97f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f2fb2be175cc","subject":"Error contract","message":"Hi"}

--- response: 201 in 25 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1e2ec4e-807e-43a5-8038-61d831b0b97f
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
Location: /v1/conversations/cnv_8a678277-74e7-450c-b7cd-4f1baf96334c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8a678277-74e7-450c-b7cd-4f1baf96334c","subject":"Error contract","status":"open","region":"eu","participants":["qa-8ca889a280e9","qa-f2fb2be175cc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:36.228292868Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-e387edcb-3659-45d0-aa72-1d3af68f7a5c

--- request headers ---
Accept: application/json
X-Fault-Key: 03c83733-fb09-45e8-a42f-c3ef6aef5c7e
X-Fault: unavailable-once
X-Correlation-Id: qa-e387edcb-3659-45d0-aa72-1d3af68f7a5c
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 503 in 16 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e387edcb-3659-45d0-aa72-1d3af68f7a5c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-e387edcb-3659-45d0-aa72-1d3af68f7a5c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1b0b3c3f-d225-4f77-a8ae-5304294e94c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b0b3c3f-d225-4f77-a8ae-5304294e94c2
Content-Type: application/json

--- request body ---
{"handle":"qa-f2fb2be175cc","password":"****"}

--- response: 200 in 31 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b0b3c3f-d225-4f77-a8ae-5304294e94c2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 519
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_55773652-2f3a-4a05-9c00-13eaa3f66ae8"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4830ab08-db2a-4a3d-948d-603350c45307

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4830ab08-db2a-4a3d-948d-603350c45307
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4830ab08-db2a-4a3d-948d-603350c45307
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
correlation: qa-7c0cf0e4-d0ee-4f06-92a8-e400867ca090

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c0cf0e4-d0ee-4f06-92a8-e400867ca090
Content-Type: application/json

--- request body ---
{"handle":"qa-f2fb2be175cc","password":"****"}

--- response: 401 in 24 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7c0cf0e4-d0ee-4f06-92a8-e400867ca090
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 504
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7c0cf0e4-d0ee-4f06-92a8-e400867ca090"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c22e7465-07b1-4c8c-961b-231b6c35e00c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c22e7465-07b1-4c8c-961b-231b6c35e00c
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c22e7465-07b1-4c8c-961b-231b6c35e00c
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
correlation: qa-3d017550-02f3-4165-a6d6-fcb26aac92c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d017550-02f3-4165-a6d6-fcb26aac92c0
Content-Type: application/json

--- request body ---
{"handle":"qa-8ca889a280e9","password":"****"}

--- response: 401 in 34 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3d017550-02f3-4165-a6d6-fcb26aac92c0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 490
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3d017550-02f3-4165-a6d6-fcb26aac92c0"}
```

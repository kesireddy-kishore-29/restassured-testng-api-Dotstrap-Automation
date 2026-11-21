# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[2]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 46 | `qa-fb5dbd7f-3e29-419b-8e9e-98f862155df2` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-f27175ee-a2a9-4022-8d59-6f21d3ea50c5` |
| 3 | `POST /v1/auth/token` | 200 | 40 | `qa-5dde4908-55f5-468d-b6c6-70530d46d10b` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-e15a9aaf-f415-4e68-9a15-19d481e951ff` |
| 5 | `GET /v1/accounts/me` | 503 | 16 | `qa-5a6807c3-6d09-4588-a46a-e9ce1714e8ed` |
| 6 | `POST /v1/auth/token` | 200 | 42 | `qa-44be8203-2c54-4278-930f-d66b21abbd46` |
| 7 | `DELETE /v1/accounts/me` | 204 | 52 | `qa-402aa981-38e0-492f-9fce-a5d7348cd09c` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-1f2d63ef-0553-4550-87af-af1837b09286` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-1aa48530-48f7-4bdf-93b3-434d164cb536` |
| 10 | `POST /v1/auth/token` | 401 | 23 | `qa-c0565ab3-2541-4064-b8f3-3373161513e6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fb5dbd7f-3e29-419b-8e9e-98f862155df2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb5dbd7f-3e29-419b-8e9e-98f862155df2
Content-Type: application/json

--- request body ---
{"handle":"qa-9c5c93ecdef6","displayName":"QA 9c5c93ecdef6","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb5dbd7f-3e29-419b-8e9e-98f862155df2
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
Location: /v1/accounts/qa-9c5c93ecdef6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_94e25a72-7b0f-4cd8-b005-b944087c84ae","handle":"qa-9c5c93ecdef6","displayName":"QA 9c5c93ecdef6","region":"eu","role":"user","createdAt":"2026-11-16T09:53:51.938197728Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f27175ee-a2a9-4022-8d59-6f21d3ea50c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f27175ee-a2a9-4022-8d59-6f21d3ea50c5
Content-Type: application/json

--- request body ---
{"handle":"qa-4bb78b2ba6b3","displayName":"QA 4bb78b2ba6b3","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-f27175ee-a2a9-4022-8d59-6f21d3ea50c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 10
Location: /v1/accounts/qa-4bb78b2ba6b3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b4c6b464-bc0f-4ab3-b60f-15a89bc32551","handle":"qa-4bb78b2ba6b3","displayName":"QA 4bb78b2ba6b3","region":"eu","role":"user","createdAt":"2026-11-16T09:53:51.966117920Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5dde4908-55f5-468d-b6c6-70530d46d10b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5dde4908-55f5-468d-b6c6-70530d46d10b
Content-Type: application/json

--- request body ---
{"handle":"qa-9c5c93ecdef6","password":"****"}

--- response: 200 in 40 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-5dde4908-55f5-468d-b6c6-70530d46d10b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 551
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_94e25a72-7b0f-4cd8-b005-b944087c84ae"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e15a9aaf-f415-4e68-9a15-19d481e951ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e15a9aaf-f415-4e68-9a15-19d481e951ff
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4bb78b2ba6b3","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-e15a9aaf-f415-4e68-9a15-19d481e951ff
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
Location: /v1/conversations/cnv_ae57f551-1cd5-489c-bfee-53635b73c795
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ae57f551-1cd5-489c-bfee-53635b73c795","subject":"Error contract","status":"open","region":"eu","participants":["qa-9c5c93ecdef6","qa-4bb78b2ba6b3"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:52.041022770Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-5a6807c3-6d09-4588-a46a-e9ce1714e8ed

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 0d7f4a7e-258f-433f-b44b-ad4c80350301
X-Correlation-Id: qa-5a6807c3-6d09-4588-a46a-e9ce1714e8ed
Content-Type: application/json

--- response: 503 in 16 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5a6807c3-6d09-4588-a46a-e9ce1714e8ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-5a6807c3-6d09-4588-a46a-e9ce1714e8ed"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-44be8203-2c54-4278-930f-d66b21abbd46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44be8203-2c54-4278-930f-d66b21abbd46
Content-Type: application/json

--- request body ---
{"handle":"qa-4bb78b2ba6b3","password":"****"}

--- response: 200 in 42 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-44be8203-2c54-4278-930f-d66b21abbd46
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 524
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b4c6b464-bc0f-4ab3-b60f-15a89bc32551"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-402aa981-38e0-492f-9fce-a5d7348cd09c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-402aa981-38e0-492f-9fce-a5d7348cd09c
Content-Type: application/json

--- response: 204 in 52 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-402aa981-38e0-492f-9fce-a5d7348cd09c
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
correlation: qa-1f2d63ef-0553-4550-87af-af1837b09286

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f2d63ef-0553-4550-87af-af1837b09286
Content-Type: application/json

--- request body ---
{"handle":"qa-4bb78b2ba6b3","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1f2d63ef-0553-4550-87af-af1837b09286
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 510
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1f2d63ef-0553-4550-87af-af1837b09286"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1aa48530-48f7-4bdf-93b3-434d164cb536

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1aa48530-48f7-4bdf-93b3-434d164cb536
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1aa48530-48f7-4bdf-93b3-434d164cb536
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
correlation: qa-c0565ab3-2541-4064-b8f3-3373161513e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0565ab3-2541-4064-b8f3-3373161513e6
Content-Type: application/json

--- request body ---
{"handle":"qa-9c5c93ecdef6","password":"****"}

--- response: 401 in 23 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c0565ab3-2541-4064-b8f3-3373161513e6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 496
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c0565ab3-2541-4064-b8f3-3373161513e6"}
```

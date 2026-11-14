# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-2c3d2510-2824-4835-823c-c28d90668985` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-b1136ebb-187a-4b3b-8a10-b202871a3277` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-d33ef244-9c29-4ea8-9386-f4c36be747e4` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-ade1b8a1-f88f-4dbe-95e3-2167f7b5acdb` |
| 5 | `POST /v1/auth/token` | 422 | 59 | `qa-2c4a8b3a-12c0-4b7d-94e4-3dae003a1871` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-5155a43d-342e-4fd8-bc37-83909ab6dcf9` |
| 7 | `DELETE /v1/accounts/me` | 204 | 59 | `qa-cd1c5ec2-307f-46b5-b405-98a2d81f5cdc` |
| 8 | `POST /v1/auth/token` | 401 | 74 | `qa-1ca4ddc8-89bf-42b6-baa4-c8272488ce72` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-6b6fc80c-ab08-4db6-80ef-3a5857ed0962` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-0e804358-fdfd-4e50-a9d6-a991b840a968` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2c3d2510-2824-4835-823c-c28d90668985

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c3d2510-2824-4835-823c-c28d90668985
Content-Type: application/json

--- request body ---
{"handle":"qa-4a4a3476317b","displayName":"QA 4a4a3476317b","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c3d2510-2824-4835-823c-c28d90668985
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 10
Location: /v1/accounts/qa-4a4a3476317b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_237570c1-d3ed-4e5e-a54c-175600f150c2","handle":"qa-4a4a3476317b","displayName":"QA 4a4a3476317b","region":"eu","role":"user","createdAt":"2026-11-10T09:59:35.103319305Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b1136ebb-187a-4b3b-8a10-b202871a3277

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1136ebb-187a-4b3b-8a10-b202871a3277
Content-Type: application/json

--- request body ---
{"handle":"qa-f3062c44e0b4","displayName":"QA f3062c44e0b4","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1136ebb-187a-4b3b-8a10-b202871a3277
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 10
Location: /v1/accounts/qa-f3062c44e0b4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_37c4430a-ad30-4ccc-8204-c6ee996dcd7a","handle":"qa-f3062c44e0b4","displayName":"QA f3062c44e0b4","region":"eu","role":"user","createdAt":"2026-11-10T09:59:35.142472619Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d33ef244-9c29-4ea8-9386-f4c36be747e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d33ef244-9c29-4ea8-9386-f4c36be747e4
Content-Type: application/json

--- request body ---
{"handle":"qa-4a4a3476317b","password":"****"}

--- response: 200 in 23 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-d33ef244-9c29-4ea8-9386-f4c36be747e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_237570c1-d3ed-4e5e-a54c-175600f150c2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ade1b8a1-f88f-4dbe-95e3-2167f7b5acdb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ade1b8a1-f88f-4dbe-95e3-2167f7b5acdb
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f3062c44e0b4","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-ade1b8a1-f88f-4dbe-95e3-2167f7b5acdb
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
Location: /v1/conversations/cnv_4dc93f36-b5da-4c0b-b813-13149fbdd7f0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4dc93f36-b5da-4c0b-b813-13149fbdd7f0","subject":"Error contract","status":"open","region":"eu","participants":["qa-4a4a3476317b","qa-f3062c44e0b4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:35.219772154Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-2c4a8b3a-12c0-4b7d-94e4-3dae003a1871

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c4a8b3a-12c0-4b7d-94e4-3dae003a1871
Content-Type: application/json

--- request body ---
{"handle":"qa-4a4a3476317b","password":"****","ttlSeconds":0}

--- response: 422 in 59 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2c4a8b3a-12c0-4b7d-94e4-3dae003a1871
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 546
RateLimit-Reset: 9
Content-Length: 294

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/auth/token","correlationId":"qa-2c4a8b3a-12c0-4b7d-94e4-3dae003a1871","errors":[{"field":"ttlSeconds","message":"1-3600"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5155a43d-342e-4fd8-bc37-83909ab6dcf9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5155a43d-342e-4fd8-bc37-83909ab6dcf9
Content-Type: application/json

--- request body ---
{"handle":"qa-f3062c44e0b4","password":"****"}

--- response: 200 in 27 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-5155a43d-342e-4fd8-bc37-83909ab6dcf9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 512
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_37c4430a-ad30-4ccc-8204-c6ee996dcd7a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cd1c5ec2-307f-46b5-b405-98a2d81f5cdc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd1c5ec2-307f-46b5-b405-98a2d81f5cdc
Content-Type: application/json

--- response: 204 in 59 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cd1c5ec2-307f-46b5-b405-98a2d81f5cdc
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
correlation: qa-1ca4ddc8-89bf-42b6-baa4-c8272488ce72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ca4ddc8-89bf-42b6-baa4-c8272488ce72
Content-Type: application/json

--- request body ---
{"handle":"qa-f3062c44e0b4","password":"****"}

--- response: 401 in 74 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1ca4ddc8-89bf-42b6-baa4-c8272488ce72
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1ca4ddc8-89bf-42b6-baa4-c8272488ce72"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6b6fc80c-ab08-4db6-80ef-3a5857ed0962

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b6fc80c-ab08-4db6-80ef-3a5857ed0962
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6b6fc80c-ab08-4db6-80ef-3a5857ed0962
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
correlation: qa-0e804358-fdfd-4e50-a9d6-a991b840a968

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e804358-fdfd-4e50-a9d6-a991b840a968
Content-Type: application/json

--- request body ---
{"handle":"qa-4a4a3476317b","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0e804358-fdfd-4e50-a9d6-a991b840a968
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 474
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0e804358-fdfd-4e50-a9d6-a991b840a968"}
```

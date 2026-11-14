# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[12]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-9d5c8d0d-e9ed-49f0-9d9d-88df38987141` |
| 2 | `POST /v1/accounts` | 201 | 17 | `qa-5b476e02-ba51-40c9-bcab-6b76ee7474f1` |
| 3 | `POST /v1/auth/token` | 200 | 18 | `qa-d866d4b5-24cd-421f-9d95-da6d819924b3` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-b2af5d86-b6a0-4f9c-8e59-d2c7a6ad4fcf` |
| 5 | `POST /v1/conversations/{id}/close` | 503 | 34 | `qa-75bec1e9-232d-469f-a294-d4180641fc1a` |
| 6 | `POST /v1/auth/token` | 200 | 62 | `qa-3c17cf3b-4f96-49ef-b25f-aae94d53d038` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-7c0fc9c4-f12e-465d-b20c-1cc4c338b0b2` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-1349fcb5-d25a-49af-a1c2-4fd9abce9f53` |
| 9 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-a3e6782f-3db9-4eda-bb2b-aa0a9fa19c3f` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-c780baa5-9cdc-4083-8097-eb274c0a024f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9d5c8d0d-e9ed-49f0-9d9d-88df38987141

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d5c8d0d-e9ed-49f0-9d9d-88df38987141
Content-Type: application/json

--- request body ---
{"handle":"qa-2df30b755a83","displayName":"QA 2df30b755a83","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d5c8d0d-e9ed-49f0-9d9d-88df38987141
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 375
RateLimit-Reset: 8
Location: /v1/accounts/qa-2df30b755a83
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e2d25e39-2f6f-43dd-afeb-3832ccd2c31d","handle":"qa-2df30b755a83","displayName":"QA 2df30b755a83","region":"eu","role":"user","createdAt":"2026-11-07T08:54:59.139158726Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5b476e02-ba51-40c9-bcab-6b76ee7474f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b476e02-ba51-40c9-bcab-6b76ee7474f1
Content-Type: application/json

--- request body ---
{"handle":"qa-df31516f7215","displayName":"QA df31516f7215","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b476e02-ba51-40c9-bcab-6b76ee7474f1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 371
RateLimit-Reset: 8
Location: /v1/accounts/qa-df31516f7215
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a32c2f28-06c8-4f12-950a-1db5a51ea9b6","handle":"qa-df31516f7215","displayName":"QA df31516f7215","region":"eu","role":"user","createdAt":"2026-11-07T08:54:59.168180654Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d866d4b5-24cd-421f-9d95-da6d819924b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d866d4b5-24cd-421f-9d95-da6d819924b3
Content-Type: application/json

--- request body ---
{"handle":"qa-2df30b755a83","password":"****"}

--- response: 200 in 18 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-d866d4b5-24cd-421f-9d95-da6d819924b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 366
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e2d25e39-2f6f-43dd-afeb-3832ccd2c31d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b2af5d86-b6a0-4f9c-8e59-d2c7a6ad4fcf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2af5d86-b6a0-4f9c-8e59-d2c7a6ad4fcf
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-df31516f7215","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2af5d86-b6a0-4f9c-8e59-d2c7a6ad4fcf
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
Location: /v1/conversations/cnv_81249222-69b1-4095-a3de-d6779e27d957
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_81249222-69b1-4095-a3de-d6779e27d957","subject":"Error contract","status":"open","region":"eu","participants":["qa-2df30b755a83","qa-df31516f7215"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:59.208557097Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_81249222-69b1-4095-a3de-d6779e27d957/close
correlation: qa-75bec1e9-232d-469f-a294-d4180641fc1a

--- request headers ---
Accept: application/json
X-Fault-Key: ce2f32ea-c0c0-47da-bb69-b719f38f4ed0
X-Fault: unavailable-once
X-Correlation-Id: qa-75bec1e9-232d-469f-a294-d4180641fc1a
Content-Type: application/json

--- response: 503 in 34 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-75bec1e9-232d-469f-a294-d4180641fc1a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 308

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_81249222-69b1-4095-a3de-d6779e27d957/close","correlationId":"qa-75bec1e9-232d-469f-a294-d4180641fc1a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3c17cf3b-4f96-49ef-b25f-aae94d53d038

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c17cf3b-4f96-49ef-b25f-aae94d53d038
Content-Type: application/json

--- request body ---
{"handle":"qa-df31516f7215","password":"****"}

--- response: 200 in 62 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c17cf3b-4f96-49ef-b25f-aae94d53d038
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 341
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a32c2f28-06c8-4f12-950a-1db5a51ea9b6"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7c0fc9c4-f12e-465d-b20c-1cc4c338b0b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c0fc9c4-f12e-465d-b20c-1cc4c338b0b2
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7c0fc9c4-f12e-465d-b20c-1cc4c338b0b2
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
correlation: qa-1349fcb5-d25a-49af-a1c2-4fd9abce9f53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1349fcb5-d25a-49af-a1c2-4fd9abce9f53
Content-Type: application/json

--- request body ---
{"handle":"qa-df31516f7215","password":"****"}

--- response: 401 in 20 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1349fcb5-d25a-49af-a1c2-4fd9abce9f53
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 335
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1349fcb5-d25a-49af-a1c2-4fd9abce9f53"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a3e6782f-3db9-4eda-bb2b-aa0a9fa19c3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3e6782f-3db9-4eda-bb2b-aa0a9fa19c3f
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a3e6782f-3db9-4eda-bb2b-aa0a9fa19c3f
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
correlation: qa-c780baa5-9cdc-4083-8097-eb274c0a024f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c780baa5-9cdc-4083-8097-eb274c0a024f
Content-Type: application/json

--- request body ---
{"handle":"qa-2df30b755a83","password":"****"}

--- response: 401 in 18 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c780baa5-9cdc-4083-8097-eb274c0a024f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 327
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c780baa5-9cdc-4083-8097-eb274c0a024f"}
```

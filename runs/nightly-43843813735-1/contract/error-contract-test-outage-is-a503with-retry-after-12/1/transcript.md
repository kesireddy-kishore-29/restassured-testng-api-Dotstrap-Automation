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
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-ab39c20b-b824-4c48-8a1e-d84fd3c7e6a8` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-59bc440e-8844-47ab-8745-9a4560497bc5` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-7bf44270-b073-465e-8db1-a18f91546120` |
| 4 | `POST /v1/conversations` | 201 | 33 | `qa-4269df59-2a4a-43bf-9ae8-116a4d48e416` |
| 5 | `POST /v1/conversations/{id}/close` | 503 | 54 | `qa-2fac962c-157e-4791-a746-682454c62abe` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-f0e2a0b5-3dbb-4050-b996-62bca6806927` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-188d1fc7-a2d8-46fe-98ab-3ff9ab18fa5d` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-c5eb68f5-c948-4aef-b46e-1381ccd57747` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-2dd03ea2-c82c-491d-93e6-cf8f9c690d89` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-8863446c-0dfc-470d-93fb-468a9b980e27` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ab39c20b-b824-4c48-8a1e-d84fd3c7e6a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab39c20b-b824-4c48-8a1e-d84fd3c7e6a8
Content-Type: application/json

--- request body ---
{"handle":"qa-438eafac2bfe","displayName":"QA 438eafac2bfe","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab39c20b-b824-4c48-8a1e-d84fd3c7e6a8
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
Location: /v1/accounts/qa-438eafac2bfe
X-Served-Region: eu
Content-Length: 181

{"id":"acc_476ddfd9-7c24-4d77-bd3d-9df16a8c6c57","handle":"qa-438eafac2bfe","displayName":"QA 438eafac2bfe","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.028525172Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-59bc440e-8844-47ab-8745-9a4560497bc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59bc440e-8844-47ab-8745-9a4560497bc5
Content-Type: application/json

--- request body ---
{"handle":"qa-d8db80aec7f6","displayName":"QA d8db80aec7f6","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-59bc440e-8844-47ab-8745-9a4560497bc5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 360
RateLimit-Reset: 7
Location: /v1/accounts/qa-d8db80aec7f6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_10c2c352-a1c7-441d-a555-b9ccd698dd2f","handle":"qa-d8db80aec7f6","displayName":"QA d8db80aec7f6","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.063376319Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7bf44270-b073-465e-8db1-a18f91546120

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7bf44270-b073-465e-8db1-a18f91546120
Content-Type: application/json

--- request body ---
{"handle":"qa-438eafac2bfe","password":"****"}

--- response: 200 in 27 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-7bf44270-b073-465e-8db1-a18f91546120
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 355
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_476ddfd9-7c24-4d77-bd3d-9df16a8c6c57"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4269df59-2a4a-43bf-9ae8-116a4d48e416

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4269df59-2a4a-43bf-9ae8-116a4d48e416
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d8db80aec7f6","subject":"Error contract","message":"Hi"}

--- response: 201 in 33 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-4269df59-2a4a-43bf-9ae8-116a4d48e416
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
Location: /v1/conversations/cnv_88bced7b-1a4d-4ccb-96c8-a8911ce30ac5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_88bced7b-1a4d-4ccb-96c8-a8911ce30ac5","subject":"Error contract","status":"open","region":"eu","participants":["qa-438eafac2bfe","qa-d8db80aec7f6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:54.151940540Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_88bced7b-1a4d-4ccb-96c8-a8911ce30ac5/close
correlation: qa-2fac962c-157e-4791-a746-682454c62abe

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: dd26f517-43b5-47e8-a637-bc993948ab79
X-Correlation-Id: qa-2fac962c-157e-4791-a746-682454c62abe
Content-Type: application/json

--- response: 503 in 54 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2fac962c-157e-4791-a746-682454c62abe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 308

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_88bced7b-1a4d-4ccb-96c8-a8911ce30ac5/close","correlationId":"qa-2fac962c-157e-4791-a746-682454c62abe"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f0e2a0b5-3dbb-4050-b996-62bca6806927

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0e2a0b5-3dbb-4050-b996-62bca6806927
Content-Type: application/json

--- request body ---
{"handle":"qa-d8db80aec7f6","password":"****"}

--- response: 200 in 26 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0e2a0b5-3dbb-4050-b996-62bca6806927
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 333
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_10c2c352-a1c7-441d-a555-b9ccd698dd2f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-188d1fc7-a2d8-46fe-98ab-3ff9ab18fa5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-188d1fc7-a2d8-46fe-98ab-3ff9ab18fa5d
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-188d1fc7-a2d8-46fe-98ab-3ff9ab18fa5d
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
correlation: qa-c5eb68f5-c948-4aef-b46e-1381ccd57747

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5eb68f5-c948-4aef-b46e-1381ccd57747
Content-Type: application/json

--- request body ---
{"handle":"qa-d8db80aec7f6","password":"****"}

--- response: 401 in 22 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c5eb68f5-c948-4aef-b46e-1381ccd57747
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 326
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c5eb68f5-c948-4aef-b46e-1381ccd57747"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2dd03ea2-c82c-491d-93e6-cf8f9c690d89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2dd03ea2-c82c-491d-93e6-cf8f9c690d89
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2dd03ea2-c82c-491d-93e6-cf8f9c690d89
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
correlation: qa-8863446c-0dfc-470d-93fb-468a9b980e27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8863446c-0dfc-470d-93fb-468a9b980e27
Content-Type: application/json

--- request body ---
{"handle":"qa-438eafac2bfe","password":"****"}

--- response: 401 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8863446c-0dfc-470d-93fb-468a9b980e27
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 319
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8863446c-0dfc-470d-93fb-468a9b980e27"}
```

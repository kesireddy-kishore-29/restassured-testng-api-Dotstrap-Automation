# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 54 | `qa-c3e828f3-4eb9-4f53-b344-c9f9bf27a4ec` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-591f1e73-edc7-4714-90e9-b4dea08f6d13` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-d971172a-a90a-4f39-b946-5ca83a3dfb03` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-3b8650a3-0e5a-4895-b283-40544374d59e` |
| 5 | `POST /v1/auth/token` | 415 | 34 | `qa-66902c79-4cb4-4060-b14f-7e525a294636` |
| 6 | `POST /v1/auth/token` | 200 | 70 | `qa-52a69d49-dc0e-4b74-a91a-267ff7762e76` |
| 7 | `DELETE /v1/accounts/me` | 204 | 42 | `qa-bf9d6d86-63de-4dc2-933a-f4672f066904` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-6465d00b-0edc-40e5-9e3c-006402b7d5f8` |
| 9 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-9452b839-c06e-4590-bc01-027309d1eb8a` |
| 10 | `POST /v1/auth/token` | 401 | 36 | `qa-1776de26-db0f-4a55-9b75-a060219feafd` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c3e828f3-4eb9-4f53-b344-c9f9bf27a4ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3e828f3-4eb9-4f53-b344-c9f9bf27a4ec
Content-Type: application/json

--- request body ---
{"handle":"qa-bdfc61d9dcde","displayName":"QA bdfc61d9dcde","password":"****","region":"eu"}

--- response: 201 in 54 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3e828f3-4eb9-4f53-b344-c9f9bf27a4ec
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
Location: /v1/accounts/qa-bdfc61d9dcde
X-Served-Region: eu
Content-Length: 181

{"id":"acc_929cfba8-36b0-4207-9eaf-cbb63bb36f40","handle":"qa-bdfc61d9dcde","displayName":"QA bdfc61d9dcde","region":"eu","role":"user","createdAt":"2026-11-28T10:37:22.654171791Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-591f1e73-edc7-4714-90e9-b4dea08f6d13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-591f1e73-edc7-4714-90e9-b4dea08f6d13
Content-Type: application/json

--- request body ---
{"handle":"qa-15e3dde890fc","displayName":"QA 15e3dde890fc","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-591f1e73-edc7-4714-90e9-b4dea08f6d13
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 551
RateLimit-Reset: 9
Location: /v1/accounts/qa-15e3dde890fc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6c03fa6d-160a-4814-b297-f0536a2c8f13","handle":"qa-15e3dde890fc","displayName":"QA 15e3dde890fc","region":"eu","role":"user","createdAt":"2026-11-28T10:37:22.713360452Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d971172a-a90a-4f39-b946-5ca83a3dfb03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d971172a-a90a-4f39-b946-5ca83a3dfb03
Content-Type: application/json

--- request body ---
{"handle":"qa-bdfc61d9dcde","password":"****"}

--- response: 200 in 24 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-d971172a-a90a-4f39-b946-5ca83a3dfb03
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 538
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_929cfba8-36b0-4207-9eaf-cbb63bb36f40"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3b8650a3-0e5a-4895-b283-40544374d59e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b8650a3-0e5a-4895-b283-40544374d59e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-15e3dde890fc","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-3b8650a3-0e5a-4895-b283-40544374d59e
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
Location: /v1/conversations/cnv_cb68c46b-4a89-4f8a-ba46-ec9f67eb47f7
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_cb68c46b-4a89-4f8a-ba46-ec9f67eb47f7","subject":"Error contract","status":"open","region":"eu","participants":["qa-bdfc61d9dcde","qa-15e3dde890fc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:22.794030813Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-66902c79-4cb4-4060-b14f-7e525a294636

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66902c79-4cb4-4060-b14f-7e525a294636
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 34 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-66902c79-4cb4-4060-b14f-7e525a294636
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 530
RateLimit-Reset: 9
Content-Length: 254

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/auth/token","correlationId":"qa-66902c79-4cb4-4060-b14f-7e525a294636"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-52a69d49-dc0e-4b74-a91a-267ff7762e76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52a69d49-dc0e-4b74-a91a-267ff7762e76
Content-Type: application/json

--- request body ---
{"handle":"qa-15e3dde890fc","password":"****"}

--- response: 200 in 70 ms ---
Date: Sat, 28 Nov 2026 10:37:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-52a69d49-dc0e-4b74-a91a-267ff7762e76
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6c03fa6d-160a-4814-b297-f0536a2c8f13"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bf9d6d86-63de-4dc2-933a-f4672f066904

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf9d6d86-63de-4dc2-933a-f4672f066904
Content-Type: application/json

--- response: 204 in 42 ms ---
Date: Sat, 28 Nov 2026 10:37:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bf9d6d86-63de-4dc2-933a-f4672f066904
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
correlation: qa-6465d00b-0edc-40e5-9e3c-006402b7d5f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6465d00b-0edc-40e5-9e3c-006402b7d5f8
Content-Type: application/json

--- request body ---
{"handle":"qa-15e3dde890fc","password":"****"}

--- response: 401 in 19 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6465d00b-0edc-40e5-9e3c-006402b7d5f8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 502
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6465d00b-0edc-40e5-9e3c-006402b7d5f8"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9452b839-c06e-4590-bc01-027309d1eb8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9452b839-c06e-4590-bc01-027309d1eb8a
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9452b839-c06e-4590-bc01-027309d1eb8a
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
correlation: qa-1776de26-db0f-4a55-9b75-a060219feafd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1776de26-db0f-4a55-9b75-a060219feafd
Content-Type: application/json

--- request body ---
{"handle":"qa-bdfc61d9dcde","password":"****"}

--- response: 401 in 36 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1776de26-db0f-4a55-9b75-a060219feafd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 488
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1776de26-db0f-4a55-9b75-a060219feafd"}
```

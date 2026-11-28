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
| 1 | `POST /v1/accounts` | 201 | 49 | `qa-8fbdb2ca-4569-4dd0-8703-42232b3a571d` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-9d589f4b-a5dd-4ece-80c6-21144c75de72` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-3e6035b5-24fd-4449-a06b-d5532974eb1e` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-2a29851b-a7b8-4710-b392-8f0c45a603eb` |
| 5 | `POST /v1/auth/token` | 415 | 64 | `qa-da4c19c5-e6f4-472c-b9c9-34f6c25c5f1c` |
| 6 | `POST /v1/auth/token` | 200 | 49 | `qa-80b4ae17-f12f-4e90-8468-84596fdd46a7` |
| 7 | `DELETE /v1/accounts/me` | 204 | 36 | `qa-269676f2-c261-421d-b75c-1e3ebdc42daf` |
| 8 | `POST /v1/auth/token` | 401 | 43 | `qa-67b0eaae-b40a-4654-825d-cbfb3558eee9` |
| 9 | `DELETE /v1/accounts/me` | 204 | 40 | `qa-5c990224-176e-4ba8-a5f8-87bead64360a` |
| 10 | `POST /v1/auth/token` | 401 | 73 | `qa-c6f5934a-98f9-4794-9136-fd9f221d93a3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8fbdb2ca-4569-4dd0-8703-42232b3a571d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fbdb2ca-4569-4dd0-8703-42232b3a571d
Content-Type: application/json

--- request body ---
{"handle":"qa-02ad1518b387","displayName":"QA 02ad1518b387","password":"****","region":"eu"}

--- response: 201 in 49 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-8fbdb2ca-4569-4dd0-8703-42232b3a571d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Location: /v1/accounts/qa-02ad1518b387
X-Served-Region: eu
Content-Length: 181

{"id":"acc_14b5a927-c919-4436-85c5-f1386685f0c7","handle":"qa-02ad1518b387","displayName":"QA 02ad1518b387","region":"eu","role":"user","createdAt":"2026-11-21T09:57:09.049928489Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9d589f4b-a5dd-4ece-80c6-21144c75de72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d589f4b-a5dd-4ece-80c6-21144c75de72
Content-Type: application/json

--- request body ---
{"handle":"qa-a8bb8a4cd27f","displayName":"QA a8bb8a4cd27f","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d589f4b-a5dd-4ece-80c6-21144c75de72
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 9
Location: /v1/accounts/qa-a8bb8a4cd27f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cfeffd83-3d96-4fe3-89e2-52ee5e5b2676","handle":"qa-a8bb8a4cd27f","displayName":"QA a8bb8a4cd27f","region":"eu","role":"user","createdAt":"2026-11-21T09:57:09.098831345Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3e6035b5-24fd-4449-a06b-d5532974eb1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e6035b5-24fd-4449-a06b-d5532974eb1e
Content-Type: application/json

--- request body ---
{"handle":"qa-02ad1518b387","password":"****"}

--- response: 200 in 33 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e6035b5-24fd-4449-a06b-d5532974eb1e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_14b5a927-c919-4436-85c5-f1386685f0c7"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2a29851b-a7b8-4710-b392-8f0c45a603eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a29851b-a7b8-4710-b392-8f0c45a603eb
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a8bb8a4cd27f","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a29851b-a7b8-4710-b392-8f0c45a603eb
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
Location: /v1/conversations/cnv_be04fc65-49a3-4198-ba19-900889e59324
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_be04fc65-49a3-4198-ba19-900889e59324","subject":"Error contract","status":"open","region":"eu","participants":["qa-02ad1518b387","qa-a8bb8a4cd27f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:09.195443569Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-da4c19c5-e6f4-472c-b9c9-34f6c25c5f1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da4c19c5-e6f4-472c-b9c9-34f6c25c5f1c
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 64 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-da4c19c5-e6f4-472c-b9c9-34f6c25c5f1c
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
Content-Length: 254

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/auth/token","correlationId":"qa-da4c19c5-e6f4-472c-b9c9-34f6c25c5f1c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-80b4ae17-f12f-4e90-8468-84596fdd46a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80b4ae17-f12f-4e90-8468-84596fdd46a7
Content-Type: application/json

--- request body ---
{"handle":"qa-a8bb8a4cd27f","password":"****"}

--- response: 200 in 49 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-80b4ae17-f12f-4e90-8468-84596fdd46a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 523
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cfeffd83-3d96-4fe3-89e2-52ee5e5b2676"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-269676f2-c261-421d-b75c-1e3ebdc42daf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-269676f2-c261-421d-b75c-1e3ebdc42daf
Content-Type: application/json

--- response: 204 in 36 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-269676f2-c261-421d-b75c-1e3ebdc42daf
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
correlation: qa-67b0eaae-b40a-4654-825d-cbfb3558eee9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67b0eaae-b40a-4654-825d-cbfb3558eee9
Content-Type: application/json

--- request body ---
{"handle":"qa-a8bb8a4cd27f","password":"****"}

--- response: 401 in 43 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-67b0eaae-b40a-4654-825d-cbfb3558eee9
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-67b0eaae-b40a-4654-825d-cbfb3558eee9"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5c990224-176e-4ba8-a5f8-87bead64360a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c990224-176e-4ba8-a5f8-87bead64360a
Content-Type: application/json

--- response: 204 in 40 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5c990224-176e-4ba8-a5f8-87bead64360a
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
correlation: qa-c6f5934a-98f9-4794-9136-fd9f221d93a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6f5934a-98f9-4794-9136-fd9f221d93a3
Content-Type: application/json

--- request body ---
{"handle":"qa-02ad1518b387","password":"****"}

--- response: 401 in 73 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c6f5934a-98f9-4794-9136-fd9f221d93a3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 483
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c6f5934a-98f9-4794-9136-fd9f221d93a3"}
```

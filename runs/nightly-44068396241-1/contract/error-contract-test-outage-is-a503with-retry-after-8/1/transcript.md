# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[8]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-4a816990-d820-46a4-938b-71db7f9b34ed` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-2712b616-9221-420b-9c53-275b5ab18a8d` |
| 3 | `POST /v1/auth/token` | 200 | 18 | `qa-9ba2b358-dfe7-4509-b14c-391f30e267e8` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-a2080a95-ff35-4d9f-b099-d9ee5e5ddb82` |
| 5 | `GET /v1/conversations/{id}` | 503 | 20 | `qa-6d4e64fa-bf99-4e82-9da7-b9864b94b2b4` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-0f1a413b-cc2b-4f99-897c-5fe7de265ed5` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-6f2eab8f-de0f-4349-80a8-0ad3d0bd24e8` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-922aa8fe-a518-402e-b411-84b08267378e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-440afdc0-c63f-4f9a-a9c5-e306dde388aa` |
| 10 | `POST /v1/auth/token` | 401 | 7 | `qa-a05b1a2f-c960-4bc4-aefd-35ae44296fb8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4a816990-d820-46a4-938b-71db7f9b34ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a816990-d820-46a4-938b-71db7f9b34ed
Content-Type: application/json

--- request body ---
{"handle":"qa-a91be46335d6","displayName":"QA a91be46335d6","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-4a816990-d820-46a4-938b-71db7f9b34ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 420
RateLimit-Reset: 8
Location: /v1/accounts/qa-a91be46335d6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0cf11f2f-f328-453c-bc83-336a743a1210","handle":"qa-a91be46335d6","displayName":"QA a91be46335d6","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.313308058Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2712b616-9221-420b-9c53-275b5ab18a8d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2712b616-9221-420b-9c53-275b5ab18a8d
Content-Type: application/json

--- request body ---
{"handle":"qa-c6ac7e3484f2","displayName":"QA c6ac7e3484f2","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-2712b616-9221-420b-9c53-275b5ab18a8d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 415
RateLimit-Reset: 8
Location: /v1/accounts/qa-c6ac7e3484f2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2c8e46bf-8c43-4b1d-b118-8befa5c4dc64","handle":"qa-c6ac7e3484f2","displayName":"QA c6ac7e3484f2","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.351471662Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9ba2b358-dfe7-4509-b14c-391f30e267e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ba2b358-dfe7-4509-b14c-391f30e267e8
Content-Type: application/json

--- request body ---
{"handle":"qa-a91be46335d6","password":"****"}

--- response: 200 in 18 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ba2b358-dfe7-4509-b14c-391f30e267e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 404
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0cf11f2f-f328-453c-bc83-336a743a1210"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a2080a95-ff35-4d9f-b099-d9ee5e5ddb82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2080a95-ff35-4d9f-b099-d9ee5e5ddb82
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c6ac7e3484f2","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2080a95-ff35-4d9f-b099-d9ee5e5ddb82
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
Location: /v1/conversations/cnv_e09965cf-b9e2-4b75-9a4e-ce29fee539c5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e09965cf-b9e2-4b75-9a4e-ce29fee539c5","subject":"Error contract","status":"open","region":"eu","participants":["qa-a91be46335d6","qa-c6ac7e3484f2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:19.438639638Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_e09965cf-b9e2-4b75-9a4e-ce29fee539c5
correlation: qa-6d4e64fa-bf99-4e82-9da7-b9864b94b2b4

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 417530e0-b203-462d-a721-25aee4395c3c
X-Correlation-Id: qa-6d4e64fa-bf99-4e82-9da7-b9864b94b2b4
Content-Type: application/json

--- response: 503 in 20 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6d4e64fa-bf99-4e82-9da7-b9864b94b2b4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 302

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_e09965cf-b9e2-4b75-9a4e-ce29fee539c5","correlationId":"qa-6d4e64fa-bf99-4e82-9da7-b9864b94b2b4"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0f1a413b-cc2b-4f99-897c-5fe7de265ed5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f1a413b-cc2b-4f99-897c-5fe7de265ed5
Content-Type: application/json

--- request body ---
{"handle":"qa-c6ac7e3484f2","password":"****"}

--- response: 200 in 18 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f1a413b-cc2b-4f99-897c-5fe7de265ed5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 385
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2c8e46bf-8c43-4b1d-b118-8befa5c4dc64"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6f2eab8f-de0f-4349-80a8-0ad3d0bd24e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f2eab8f-de0f-4349-80a8-0ad3d0bd24e8
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6f2eab8f-de0f-4349-80a8-0ad3d0bd24e8
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
correlation: qa-922aa8fe-a518-402e-b411-84b08267378e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-922aa8fe-a518-402e-b411-84b08267378e
Content-Type: application/json

--- request body ---
{"handle":"qa-c6ac7e3484f2","password":"****"}

--- response: 401 in 18 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-922aa8fe-a518-402e-b411-84b08267378e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 380
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-922aa8fe-a518-402e-b411-84b08267378e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-440afdc0-c63f-4f9a-a9c5-e306dde388aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-440afdc0-c63f-4f9a-a9c5-e306dde388aa
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-440afdc0-c63f-4f9a-a9c5-e306dde388aa
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
correlation: qa-a05b1a2f-c960-4bc4-aefd-35ae44296fb8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a05b1a2f-c960-4bc4-aefd-35ae44296fb8
Content-Type: application/json

--- request body ---
{"handle":"qa-a91be46335d6","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a05b1a2f-c960-4bc4-aefd-35ae44296fb8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 374
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a05b1a2f-c960-4bc4-aefd-35ae44296fb8"}
```

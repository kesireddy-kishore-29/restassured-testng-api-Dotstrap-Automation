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
| 1 | `POST /v1/accounts` | 201 | 37 | `qa-e1fa2998-893d-46b0-a064-56bb1e86d390` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-54e79d94-7018-4543-9a87-cdfc8d10dd0a` |
| 3 | `POST /v1/auth/token` | 200 | 9 | `qa-a0fa897d-1da5-4966-b32e-2ec341f4af3c` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-1a3340ee-c99a-4e78-9e5b-4621241f3e9a` |
| 5 | `POST /v1/auth/token` | 415 | 71 | `qa-8ea58c14-9174-4b73-afd3-1a0bcb5bf8bb` |
| 6 | `POST /v1/auth/token` | 200 | 48 | `qa-2d9ed57a-02b6-44fd-b2c7-74d2aceaf0d7` |
| 7 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-163fc64e-5c63-4482-9a8c-a441c464dace` |
| 8 | `POST /v1/auth/token` | 401 | 27 | `qa-e3cbb558-474f-45de-a5a2-9ec4146988b5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-0da839b7-e4f6-4545-be39-0a7ecf3bfd55` |
| 10 | `POST /v1/auth/token` | 401 | 7 | `qa-c646e20d-4c30-4194-a313-8eff5468be94` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e1fa2998-893d-46b0-a064-56bb1e86d390

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1fa2998-893d-46b0-a064-56bb1e86d390
Content-Type: application/json

--- request body ---
{"handle":"qa-37d7593cd010","displayName":"QA 37d7593cd010","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1fa2998-893d-46b0-a064-56bb1e86d390
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 10
Location: /v1/accounts/qa-37d7593cd010
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7e0443be-2e53-4b43-9e95-a270ffec0594","handle":"qa-37d7593cd010","displayName":"QA 37d7593cd010","region":"eu","role":"user","createdAt":"2026-11-10T09:59:35.096972986Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-54e79d94-7018-4543-9a87-cdfc8d10dd0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54e79d94-7018-4543-9a87-cdfc8d10dd0a
Content-Type: application/json

--- request body ---
{"handle":"qa-b311498b476f","displayName":"QA b311498b476f","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-54e79d94-7018-4543-9a87-cdfc8d10dd0a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 10
Location: /v1/accounts/qa-b311498b476f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_69aaf05e-64a6-4813-8ef8-a820019e94dd","handle":"qa-b311498b476f","displayName":"QA b311498b476f","region":"eu","role":"user","createdAt":"2026-11-10T09:59:35.149890109Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a0fa897d-1da5-4966-b32e-2ec341f4af3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0fa897d-1da5-4966-b32e-2ec341f4af3c
Content-Type: application/json

--- request body ---
{"handle":"qa-37d7593cd010","password":"****"}

--- response: 200 in 9 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0fa897d-1da5-4966-b32e-2ec341f4af3c
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7e0443be-2e53-4b43-9e95-a270ffec0594"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1a3340ee-c99a-4e78-9e5b-4621241f3e9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a3340ee-c99a-4e78-9e5b-4621241f3e9a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b311498b476f","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a3340ee-c99a-4e78-9e5b-4621241f3e9a
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
Location: /v1/conversations/cnv_18be27cc-182e-4bd1-9c5c-12026ac7e970
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_18be27cc-182e-4bd1-9c5c-12026ac7e970","subject":"Error contract","status":"open","region":"eu","participants":["qa-37d7593cd010","qa-b311498b476f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:35.194500144Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-8ea58c14-9174-4b73-afd3-1a0bcb5bf8bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ea58c14-9174-4b73-afd3-1a0bcb5bf8bb
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 71 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8ea58c14-9174-4b73-afd3-1a0bcb5bf8bb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 542
RateLimit-Reset: 9
Content-Length: 254

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/auth/token","correlationId":"qa-8ea58c14-9174-4b73-afd3-1a0bcb5bf8bb"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2d9ed57a-02b6-44fd-b2c7-74d2aceaf0d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d9ed57a-02b6-44fd-b2c7-74d2aceaf0d7
Content-Type: application/json

--- request body ---
{"handle":"qa-b311498b476f","password":"****"}

--- response: 200 in 48 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d9ed57a-02b6-44fd-b2c7-74d2aceaf0d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 520
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_69aaf05e-64a6-4813-8ef8-a820019e94dd"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-163fc64e-5c63-4482-9a8c-a441c464dace

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-163fc64e-5c63-4482-9a8c-a441c464dace
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-163fc64e-5c63-4482-9a8c-a441c464dace
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
correlation: qa-e3cbb558-474f-45de-a5a2-9ec4146988b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3cbb558-474f-45de-a5a2-9ec4146988b5
Content-Type: application/json

--- request body ---
{"handle":"qa-b311498b476f","password":"****"}

--- response: 401 in 27 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e3cbb558-474f-45de-a5a2-9ec4146988b5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 507
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e3cbb558-474f-45de-a5a2-9ec4146988b5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0da839b7-e4f6-4545-be39-0a7ecf3bfd55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0da839b7-e4f6-4545-be39-0a7ecf3bfd55
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0da839b7-e4f6-4545-be39-0a7ecf3bfd55
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
correlation: qa-c646e20d-4c30-4194-a313-8eff5468be94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c646e20d-4c30-4194-a313-8eff5468be94
Content-Type: application/json

--- request body ---
{"handle":"qa-37d7593cd010","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c646e20d-4c30-4194-a313-8eff5468be94
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c646e20d-4c30-4194-a313-8eff5468be94"}
```

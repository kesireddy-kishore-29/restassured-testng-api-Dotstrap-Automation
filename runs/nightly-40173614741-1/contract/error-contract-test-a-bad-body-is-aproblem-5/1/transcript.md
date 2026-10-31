# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[5]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 44 | `qa-5aec5f27-3dff-4fa5-a5d2-ec054e560efe` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-0ffc2175-8534-42b8-9769-68383dd549c4` |
| 3 | `POST /v1/auth/token` | 200 | 8 | `qa-8fa1315e-fab0-4892-b598-d6bbe9d3c428` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-33463187-afc3-4472-a07f-b5045c6010da` |
| 5 | `POST /v1/accounts` | 422 | 16 | `qa-5027deb4-0b3c-4dde-a90f-c07f6e024874` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-7542bc46-c892-487a-9544-00e07a6ead8e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-48ad3446-2eab-4b85-8295-7ba45a6ff656` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-1581e989-ba59-469b-ab07-f819d01bdc8a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-0f6b1ab4-a909-406c-8ceb-922f3cd15b11` |
| 10 | `POST /v1/auth/token` | 401 | 20 | `qa-92a274bd-98ad-4695-b321-b3ffdbb3d4ad` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5aec5f27-3dff-4fa5-a5d2-ec054e560efe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5aec5f27-3dff-4fa5-a5d2-ec054e560efe
Content-Type: application/json

--- request body ---
{"handle":"qa-415463d17065","displayName":"QA 415463d17065","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-5aec5f27-3dff-4fa5-a5d2-ec054e560efe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 476
RateLimit-Reset: 8
Location: /v1/accounts/qa-415463d17065
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0f214968-2d43-4a32-845c-df0cf900cc89","handle":"qa-415463d17065","displayName":"QA 415463d17065","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.645864849Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0ffc2175-8534-42b8-9769-68383dd549c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ffc2175-8534-42b8-9769-68383dd549c4
Content-Type: application/json

--- request body ---
{"handle":"qa-9a336c02e4b8","displayName":"QA 9a336c02e4b8","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ffc2175-8534-42b8-9769-68383dd549c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 460
RateLimit-Reset: 8
Location: /v1/accounts/qa-9a336c02e4b8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_543ebb18-59a8-4d0e-bdbd-f643b9abe5f7","handle":"qa-9a336c02e4b8","displayName":"QA 9a336c02e4b8","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.690679381Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8fa1315e-fab0-4892-b598-d6bbe9d3c428

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fa1315e-fab0-4892-b598-d6bbe9d3c428
Content-Type: application/json

--- request body ---
{"handle":"qa-415463d17065","password":"****"}

--- response: 200 in 8 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-8fa1315e-fab0-4892-b598-d6bbe9d3c428
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 455
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0f214968-2d43-4a32-845c-df0cf900cc89"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-33463187-afc3-4472-a07f-b5045c6010da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33463187-afc3-4472-a07f-b5045c6010da
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9a336c02e4b8","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-33463187-afc3-4472-a07f-b5045c6010da
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
Location: /v1/conversations/cnv_b77b9d1a-4e51-4253-afe7-067613ba8fc7
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b77b9d1a-4e51-4253-afe7-067613ba8fc7","subject":"Error contract","status":"open","region":"eu","participants":["qa-415463d17065","qa-9a336c02e4b8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:25.722719442Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-5027deb4-0b3c-4dde-a90f-c07f6e024874

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5027deb4-0b3c-4dde-a90f-c07f6e024874
Content-Type: application/json

--- request body ---
{"handle":"ab","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 16 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5027deb4-0b3c-4dde-a90f-c07f6e024874
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 449
RateLimit-Reset: 8
Content-Length: 338

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-5027deb4-0b3c-4dde-a90f-c07f6e024874","errors":[{"field":"handle","message":"3-30 characters: a-z, 0-9 and '-', not starting with '-'"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7542bc46-c892-487a-9544-00e07a6ead8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7542bc46-c892-487a-9544-00e07a6ead8e
Content-Type: application/json

--- request body ---
{"handle":"qa-9a336c02e4b8","password":"****"}

--- response: 200 in 25 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-7542bc46-c892-487a-9544-00e07a6ead8e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 435
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_543ebb18-59a8-4d0e-bdbd-f643b9abe5f7"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-48ad3446-2eab-4b85-8295-7ba45a6ff656

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48ad3446-2eab-4b85-8295-7ba45a6ff656
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-48ad3446-2eab-4b85-8295-7ba45a6ff656
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
correlation: qa-1581e989-ba59-469b-ab07-f819d01bdc8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1581e989-ba59-469b-ab07-f819d01bdc8a
Content-Type: application/json

--- request body ---
{"handle":"qa-9a336c02e4b8","password":"****"}

--- response: 401 in 19 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1581e989-ba59-469b-ab07-f819d01bdc8a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 426
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1581e989-ba59-469b-ab07-f819d01bdc8a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0f6b1ab4-a909-406c-8ceb-922f3cd15b11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f6b1ab4-a909-406c-8ceb-922f3cd15b11
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0f6b1ab4-a909-406c-8ceb-922f3cd15b11
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
correlation: qa-92a274bd-98ad-4695-b321-b3ffdbb3d4ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92a274bd-98ad-4695-b321-b3ffdbb3d4ad
Content-Type: application/json

--- request body ---
{"handle":"qa-415463d17065","password":"****"}

--- response: 401 in 20 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-92a274bd-98ad-4695-b321-b3ffdbb3d4ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 418
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-92a274bd-98ad-4695-b321-b3ffdbb3d4ad"}
```

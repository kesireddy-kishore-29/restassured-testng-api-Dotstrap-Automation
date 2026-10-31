# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[15]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 71 | `qa-12526dad-25e8-42a3-9613-46dc131abec3` |
| 2 | `POST /v1/accounts` | 201 | 41 | `qa-4382f601-205c-4cf7-99cf-d65825413fd4` |
| 3 | `POST /v1/auth/token` | 200 | 40 | `qa-d13e73c6-fd1f-4a66-9fca-4152d9966910` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-0be49948-ed13-48bc-8440-1e96ce1765e3` |
| 5 | `POST /v1/credits/purchases` | 400 | 24 | `qa-0f20705a-b889-433b-9063-2c392ddb5806` |
| 6 | `POST /v1/auth/token` | 200 | 51 | `qa-cc3d1699-e03d-43ac-b6ae-fa7dd0814bd1` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-753e76ad-bd53-492d-b5d7-42193c40614a` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-2d5b54f9-78c9-4800-a360-b154eb1b02f5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-988d17d9-2e0d-45ca-ad72-1079e7c09cec` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-c09a5cfc-2b48-4ec3-9d12-4d8e63a8696d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-12526dad-25e8-42a3-9613-46dc131abec3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12526dad-25e8-42a3-9613-46dc131abec3
Content-Type: application/json

--- request body ---
{"handle":"qa-428777717560","displayName":"QA 428777717560","password":"****","region":"eu"}

--- response: 201 in 71 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-12526dad-25e8-42a3-9613-46dc131abec3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 363
RateLimit-Reset: 7
Location: /v1/accounts/qa-428777717560
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c647f431-e9b6-44ee-8ed9-33d7cbdd2043","handle":"qa-428777717560","displayName":"QA 428777717560","region":"eu","role":"user","createdAt":"2026-10-30T08:46:05.213188919Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4382f601-205c-4cf7-99cf-d65825413fd4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4382f601-205c-4cf7-99cf-d65825413fd4
Content-Type: application/json

--- request body ---
{"handle":"qa-d39896818758","displayName":"QA d39896818758","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-4382f601-205c-4cf7-99cf-d65825413fd4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 361
RateLimit-Reset: 7
Location: /v1/accounts/qa-d39896818758
X-Served-Region: eu
Content-Length: 181

{"id":"acc_32e3dad6-99bf-47d6-905f-e5f837752e73","handle":"qa-d39896818758","displayName":"QA d39896818758","region":"eu","role":"user","createdAt":"2026-10-30T08:46:05.271845074Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d13e73c6-fd1f-4a66-9fca-4152d9966910

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d13e73c6-fd1f-4a66-9fca-4152d9966910
Content-Type: application/json

--- request body ---
{"handle":"qa-428777717560","password":"****"}

--- response: 200 in 40 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-d13e73c6-fd1f-4a66-9fca-4152d9966910
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 360
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c647f431-e9b6-44ee-8ed9-33d7cbdd2043"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0be49948-ed13-48bc-8440-1e96ce1765e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0be49948-ed13-48bc-8440-1e96ce1765e3
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d39896818758","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-0be49948-ed13-48bc-8440-1e96ce1765e3
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
Location: /v1/conversations/cnv_66a92761-7e2d-4535-ad40-464a304273d8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_66a92761-7e2d-4535-ad40-464a304273d8","subject":"Error contract","status":"open","region":"eu","participants":["qa-428777717560","qa-d39896818758"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:05.380885769Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-0f20705a-b889-433b-9063-2c392ddb5806

--- request headers ---
Accept: application/json
Idempotency-Key: qa-6fd30c90706d4546913972a980ac2331
X-Correlation-Id: qa-0f20705a-b889-433b-9063-2c392ddb5806
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 24 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0f20705a-b889-433b-9063-2c392ddb5806
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
Content-Length: 262

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/credits/purchases","correlationId":"qa-0f20705a-b889-433b-9063-2c392ddb5806"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-cc3d1699-e03d-43ac-b6ae-fa7dd0814bd1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc3d1699-e03d-43ac-b6ae-fa7dd0814bd1
Content-Type: application/json

--- request body ---
{"handle":"qa-d39896818758","password":"****"}

--- response: 200 in 51 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc3d1699-e03d-43ac-b6ae-fa7dd0814bd1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 342
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_32e3dad6-99bf-47d6-905f-e5f837752e73"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-753e76ad-bd53-492d-b5d7-42193c40614a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-753e76ad-bd53-492d-b5d7-42193c40614a
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-753e76ad-bd53-492d-b5d7-42193c40614a
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
correlation: qa-2d5b54f9-78c9-4800-a360-b154eb1b02f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d5b54f9-78c9-4800-a360-b154eb1b02f5
Content-Type: application/json

--- request body ---
{"handle":"qa-d39896818758","password":"****"}

--- response: 401 in 10 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2d5b54f9-78c9-4800-a360-b154eb1b02f5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 332
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2d5b54f9-78c9-4800-a360-b154eb1b02f5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-988d17d9-2e0d-45ca-ad72-1079e7c09cec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-988d17d9-2e0d-45ca-ad72-1079e7c09cec
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-988d17d9-2e0d-45ca-ad72-1079e7c09cec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-c09a5cfc-2b48-4ec3-9d12-4d8e63a8696d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c09a5cfc-2b48-4ec3-9d12-4d8e63a8696d
Content-Type: application/json

--- request body ---
{"handle":"qa-428777717560","password":"****"}

--- response: 401 in 13 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c09a5cfc-2b48-4ec3-9d12-4d8e63a8696d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 327
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c09a5cfc-2b48-4ec3-9d12-4d8e63a8696d"}
```

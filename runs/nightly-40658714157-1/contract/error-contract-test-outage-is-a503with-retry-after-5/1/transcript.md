# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/{handle}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[5]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-3fd65b5b-5d25-4b79-9ecc-c64c046becc0` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-fb9c8f61-49a8-4b3c-aef4-c39fd8996039` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-87ba6415-694f-4860-be78-e4e66b909cae` |
| 4 | `POST /v1/conversations` | 201 | 44 | `qa-6f2c8ec4-f6fe-493f-b4ba-51d1e868a29c` |
| 5 | `GET /v1/accounts/{handle}` | 503 | 23 | `qa-d317e3bb-d2d8-4dff-80d7-fbbf664c92e9` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-d472d581-7ddc-47bd-8eaa-6f79be8f66f3` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-7e70c15a-4533-45e4-a1f7-a3b69a59f152` |
| 8 | `POST /v1/auth/token` | 401 | 27 | `qa-12ab2725-726e-4dc6-91a5-8715c3dc1521` |
| 9 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-4483bcb0-1fc3-4c74-8e76-a78c2d6148b1` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-364916a2-ac60-4692-bb22-e963a40016a0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3fd65b5b-5d25-4b79-9ecc-c64c046becc0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fd65b5b-5d25-4b79-9ecc-c64c046becc0
Content-Type: application/json

--- request body ---
{"handle":"qa-3c895bbad841","displayName":"QA 3c895bbad841","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-3fd65b5b-5d25-4b79-9ecc-c64c046becc0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 488
RateLimit-Reset: 9
Location: /v1/accounts/qa-3c895bbad841
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9130d13a-43de-4aa7-a08a-9661589ba3bb","handle":"qa-3c895bbad841","displayName":"QA 3c895bbad841","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.288650155Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-fb9c8f61-49a8-4b3c-aef4-c39fd8996039

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb9c8f61-49a8-4b3c-aef4-c39fd8996039
Content-Type: application/json

--- request body ---
{"handle":"qa-66deceb727a6","displayName":"QA 66deceb727a6","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb9c8f61-49a8-4b3c-aef4-c39fd8996039
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 481
RateLimit-Reset: 9
Location: /v1/accounts/qa-66deceb727a6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a6584f7e-37b3-42f1-9dcb-1d10b041b0b3","handle":"qa-66deceb727a6","displayName":"QA 66deceb727a6","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.330226451Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-87ba6415-694f-4860-be78-e4e66b909cae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87ba6415-694f-4860-be78-e4e66b909cae
Content-Type: application/json

--- request body ---
{"handle":"qa-3c895bbad841","password":"****"}

--- response: 200 in 25 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-87ba6415-694f-4860-be78-e4e66b909cae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 470
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9130d13a-43de-4aa7-a08a-9661589ba3bb"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6f2c8ec4-f6fe-493f-b4ba-51d1e868a29c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f2c8ec4-f6fe-493f-b4ba-51d1e868a29c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-66deceb727a6","subject":"Error contract","message":"Hi"}

--- response: 201 in 44 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f2c8ec4-f6fe-493f-b4ba-51d1e868a29c
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
Location: /v1/conversations/cnv_43b7a3fb-e049-401b-9204-95861a9c2d08
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_43b7a3fb-e049-401b-9204-95861a9c2d08","subject":"Error contract","status":"open","region":"eu","participants":["qa-3c895bbad841","qa-66deceb727a6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:52.402765587Z"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-3c895bbad841
correlation: qa-d317e3bb-d2d8-4dff-80d7-fbbf664c92e9

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 03529c74-40d8-4732-a727-437241a3b9d9
X-Correlation-Id: qa-d317e3bb-d2d8-4dff-80d7-fbbf664c92e9
Content-Type: application/json

--- response: 503 in 23 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d317e3bb-d2d8-4dff-80d7-fbbf664c92e9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 272

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/qa-3c895bbad841","correlationId":"qa-d317e3bb-d2d8-4dff-80d7-fbbf664c92e9"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d472d581-7ddc-47bd-8eaa-6f79be8f66f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d472d581-7ddc-47bd-8eaa-6f79be8f66f3
Content-Type: application/json

--- request body ---
{"handle":"qa-66deceb727a6","password":"****"}

--- response: 200 in 30 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-d472d581-7ddc-47bd-8eaa-6f79be8f66f3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 442
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a6584f7e-37b3-42f1-9dcb-1d10b041b0b3"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7e70c15a-4533-45e4-a1f7-a3b69a59f152

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e70c15a-4533-45e4-a1f7-a3b69a59f152
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7e70c15a-4533-45e4-a1f7-a3b69a59f152
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
correlation: qa-12ab2725-726e-4dc6-91a5-8715c3dc1521

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12ab2725-726e-4dc6-91a5-8715c3dc1521
Content-Type: application/json

--- request body ---
{"handle":"qa-66deceb727a6","password":"****"}

--- response: 401 in 27 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-12ab2725-726e-4dc6-91a5-8715c3dc1521
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 435
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-12ab2725-726e-4dc6-91a5-8715c3dc1521"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4483bcb0-1fc3-4c74-8e76-a78c2d6148b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4483bcb0-1fc3-4c74-8e76-a78c2d6148b1
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4483bcb0-1fc3-4c74-8e76-a78c2d6148b1
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
correlation: qa-364916a2-ac60-4692-bb22-e963a40016a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-364916a2-ac60-4692-bb22-e963a40016a0
Content-Type: application/json

--- request body ---
{"handle":"qa-3c895bbad841","password":"****"}

--- response: 401 in 19 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-364916a2-ac60-4692-bb22-e963a40016a0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 429
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-364916a2-ac60-4692-bb22-e963a40016a0"}
```

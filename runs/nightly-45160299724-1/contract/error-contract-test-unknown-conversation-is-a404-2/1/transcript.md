# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-80f6a100-9923-4009-941d-d80296fd9c69` |
| 2 | `POST /v1/auth/token` | 200 | 18 | `qa-5521bcca-5992-45bd-883e-2f145c881ab6` |
| 3 | `POST /v1/conversations/{id}/messages` | 404 | 12 | `qa-fec41197-6bb4-4a6b-a974-475987205e49` |
| 4 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-fdcc203c-fb6d-4ac6-b9a2-b5a590e0b436` |
| 5 | `POST /v1/auth/token` | 401 | 5 | `qa-25b3d723-9a66-4152-9b53-1bdf32ab9117` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-80f6a100-9923-4009-941d-d80296fd9c69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80f6a100-9923-4009-941d-d80296fd9c69
Content-Type: application/json

--- request body ---
{"handle":"qa-b18d7e106c13","displayName":"QA b18d7e106c13","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-80f6a100-9923-4009-941d-d80296fd9c69
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 291
RateLimit-Reset: 7
Location: /v1/accounts/qa-b18d7e106c13
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8f7a7539-a47e-4b05-b5d4-c147a142c6f6","handle":"qa-b18d7e106c13","displayName":"QA b18d7e106c13","region":"eu","role":"user","createdAt":"2026-11-23T10:55:00.432489514Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-5521bcca-5992-45bd-883e-2f145c881ab6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5521bcca-5992-45bd-883e-2f145c881ab6
Content-Type: application/json

--- request body ---
{"handle":"qa-b18d7e106c13","password":"****"}

--- response: 200 in 18 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-5521bcca-5992-45bd-883e-2f145c881ab6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 285
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8f7a7539-a47e-4b05-b5d4-c147a142c6f6"}
```

## 3. POST /v1/conversations/{id}/messages

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-fec41197-6bb4-4a6b-a974-475987205e49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fec41197-6bb4-4a6b-a974-475987205e49
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 404 in 12 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fec41197-6bb4-4a6b-a974-475987205e49
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
Content-Length: 262

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-fec41197-6bb4-4a6b-a974-475987205e49"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fdcc203c-fb6d-4ac6-b9a2-b5a590e0b436

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fdcc203c-fb6d-4ac6-b9a2-b5a590e0b436
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fdcc203c-fb6d-4ac6-b9a2-b5a590e0b436
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

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-25b3d723-9a66-4152-9b53-1bdf32ab9117

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25b3d723-9a66-4152-9b53-1bdf32ab9117
Content-Type: application/json

--- request body ---
{"handle":"qa-b18d7e106c13","password":"****"}

--- response: 401 in 5 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-25b3d723-9a66-4152-9b53-1bdf32ab9117
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 274
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-25b3d723-9a66-4152-9b53-1bdf32ab9117"}
```

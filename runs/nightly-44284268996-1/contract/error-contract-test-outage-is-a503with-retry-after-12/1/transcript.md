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
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-421121e5-4f03-42ec-8cf8-3fa6fde80001` |
| 2 | `POST /v1/accounts` | 201 | 12 | `qa-ed48433b-efc3-4812-825f-d584196b8585` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-e9c51a1f-2ac0-47c1-b2e1-0522ecdce4f8` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-156a2a4d-c0f1-4b88-a3b6-8bb71e2a4c46` |
| 5 | `POST /v1/conversations/{id}/close` | 503 | 9 | `qa-e8332e73-1289-469d-a963-77e27f759df8` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-78211737-da28-41eb-a9df-38b314ceb4b8` |
| 7 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-e6e9aabf-6b85-4687-8397-646235cdde4a` |
| 8 | `POST /v1/auth/token` | 401 | 4 | `qa-63005537-75dd-4471-8129-d31af3b5cefa` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-5e2637f9-8a01-40c0-9764-f0f449975fa4` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-7828969c-90fc-4bbc-9560-2c4071c9a9d6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-421121e5-4f03-42ec-8cf8-3fa6fde80001

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-421121e5-4f03-42ec-8cf8-3fa6fde80001
Content-Type: application/json

--- request body ---
{"handle":"qa-f9c663e5c616","displayName":"QA f9c663e5c616","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-421121e5-4f03-42ec-8cf8-3fa6fde80001
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 372
RateLimit-Reset: 8
Location: /v1/accounts/qa-f9c663e5c616
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a1800248-9a0c-488d-9948-84ce069b8ad2","handle":"qa-f9c663e5c616","displayName":"QA f9c663e5c616","region":"eu","role":"user","createdAt":"2026-11-18T10:19:52.490944346Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ed48433b-efc3-4812-825f-d584196b8585

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed48433b-efc3-4812-825f-d584196b8585
Content-Type: application/json

--- request body ---
{"handle":"qa-b8bf53b37f94","displayName":"QA b8bf53b37f94","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed48433b-efc3-4812-825f-d584196b8585
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 370
RateLimit-Reset: 8
Location: /v1/accounts/qa-b8bf53b37f94
X-Served-Region: eu
Content-Length: 181

{"id":"acc_515b1173-0f48-4408-822c-2d0d691574c3","handle":"qa-b8bf53b37f94","displayName":"QA b8bf53b37f94","region":"eu","role":"user","createdAt":"2026-11-18T10:19:52.511140689Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e9c51a1f-2ac0-47c1-b2e1-0522ecdce4f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9c51a1f-2ac0-47c1-b2e1-0522ecdce4f8
Content-Type: application/json

--- request body ---
{"handle":"qa-f9c663e5c616","password":"****"}

--- response: 200 in 21 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9c51a1f-2ac0-47c1-b2e1-0522ecdce4f8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 365
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a1800248-9a0c-488d-9948-84ce069b8ad2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-156a2a4d-c0f1-4b88-a3b6-8bb71e2a4c46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-156a2a4d-c0f1-4b88-a3b6-8bb71e2a4c46
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b8bf53b37f94","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-156a2a4d-c0f1-4b88-a3b6-8bb71e2a4c46
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
Location: /v1/conversations/cnv_de3e926f-9a40-4dda-b659-15cbf9235c96
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_de3e926f-9a40-4dda-b659-15cbf9235c96","subject":"Error contract","status":"open","region":"eu","participants":["qa-f9c663e5c616","qa-b8bf53b37f94"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:52.558162585Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_de3e926f-9a40-4dda-b659-15cbf9235c96/close
correlation: qa-e8332e73-1289-469d-a963-77e27f759df8

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: fa2735be-e1c7-405e-b0fd-10b5ca7881ba
X-Correlation-Id: qa-e8332e73-1289-469d-a963-77e27f759df8
Content-Type: application/json

--- response: 503 in 9 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e8332e73-1289-469d-a963-77e27f759df8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 308

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_de3e926f-9a40-4dda-b659-15cbf9235c96/close","correlationId":"qa-e8332e73-1289-469d-a963-77e27f759df8"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-78211737-da28-41eb-a9df-38b314ceb4b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78211737-da28-41eb-a9df-38b314ceb4b8
Content-Type: application/json

--- request body ---
{"handle":"qa-b8bf53b37f94","password":"****"}

--- response: 200 in 21 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-78211737-da28-41eb-a9df-38b314ceb4b8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 342
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_515b1173-0f48-4408-822c-2d0d691574c3"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e6e9aabf-6b85-4687-8397-646235cdde4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6e9aabf-6b85-4687-8397-646235cdde4a
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e6e9aabf-6b85-4687-8397-646235cdde4a
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
correlation: qa-63005537-75dd-4471-8129-d31af3b5cefa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63005537-75dd-4471-8129-d31af3b5cefa
Content-Type: application/json

--- request body ---
{"handle":"qa-b8bf53b37f94","password":"****"}

--- response: 401 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-63005537-75dd-4471-8129-d31af3b5cefa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 336
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-63005537-75dd-4471-8129-d31af3b5cefa"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5e2637f9-8a01-40c0-9764-f0f449975fa4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e2637f9-8a01-40c0-9764-f0f449975fa4
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5e2637f9-8a01-40c0-9764-f0f449975fa4
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
correlation: qa-7828969c-90fc-4bbc-9560-2c4071c9a9d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7828969c-90fc-4bbc-9560-2c4071c9a9d6
Content-Type: application/json

--- request body ---
{"handle":"qa-f9c663e5c616","password":"****"}

--- response: 401 in 11 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7828969c-90fc-4bbc-9560-2c4071c9a9d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 332
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7828969c-90fc-4bbc-9560-2c4071c9a9d6"}
```

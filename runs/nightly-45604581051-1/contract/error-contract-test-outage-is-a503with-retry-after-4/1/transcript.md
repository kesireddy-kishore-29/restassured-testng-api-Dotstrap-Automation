# Transcript: Every operation answers an outage with a 503 problem and Retry-After [DELETE /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[4]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 57 | `qa-0b8adbc2-f78f-46b7-80d9-409c39ae368b` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-0860cba7-a119-4383-aab3-21638a990b64` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-900237ae-6dc3-49bc-85cc-5c49fc7af3de` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-3de138f2-bb34-4fce-adf4-a8ddb1ed6e6c` |
| 5 | `DELETE /v1/accounts/me` | 503 | 14 | `qa-e574c8c7-3460-40e1-a963-e1985047101a` |
| 6 | `POST /v1/auth/token` | 200 | 45 | `qa-2292e67f-3856-4da7-abdf-e8b8168a9191` |
| 7 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-854ede25-b936-4099-a8aa-bac5ea067bd7` |
| 8 | `POST /v1/auth/token` | 401 | 36 | `qa-564933f3-8837-46e5-943a-f100b132085b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-2cb84fcb-543b-4585-b4a2-902c8060ee80` |
| 10 | `POST /v1/auth/token` | 401 | 46 | `qa-ddf3ebf5-debb-4b37-be73-b4f25e473bff` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0b8adbc2-f78f-46b7-80d9-409c39ae368b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b8adbc2-f78f-46b7-80d9-409c39ae368b
Content-Type: application/json

--- request body ---
{"handle":"qa-6805da21e8fe","displayName":"QA 6805da21e8fe","password":"****","region":"eu"}

--- response: 201 in 57 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b8adbc2-f78f-46b7-80d9-409c39ae368b
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
Location: /v1/accounts/qa-6805da21e8fe
X-Served-Region: eu
Content-Length: 181

{"id":"acc_286850b1-ff02-47bd-8db6-4e2b959e64fa","handle":"qa-6805da21e8fe","displayName":"QA 6805da21e8fe","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.421020904Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0860cba7-a119-4383-aab3-21638a990b64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0860cba7-a119-4383-aab3-21638a990b64
Content-Type: application/json

--- request body ---
{"handle":"qa-692d350be09b","displayName":"QA 692d350be09b","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-0860cba7-a119-4383-aab3-21638a990b64
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 468
RateLimit-Reset: 8
Location: /v1/accounts/qa-692d350be09b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_64954155-79f0-41b1-9135-8923a0d613a6","handle":"qa-692d350be09b","displayName":"QA 692d350be09b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.467632507Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-900237ae-6dc3-49bc-85cc-5c49fc7af3de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-900237ae-6dc3-49bc-85cc-5c49fc7af3de
Content-Type: application/json

--- request body ---
{"handle":"qa-6805da21e8fe","password":"****"}

--- response: 200 in 33 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-900237ae-6dc3-49bc-85cc-5c49fc7af3de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 461
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_286850b1-ff02-47bd-8db6-4e2b959e64fa"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3de138f2-bb34-4fce-adf4-a8ddb1ed6e6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3de138f2-bb34-4fce-adf4-a8ddb1ed6e6c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-692d350be09b","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-3de138f2-bb34-4fce-adf4-a8ddb1ed6e6c
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
Location: /v1/conversations/cnv_ee8b6857-9060-45b2-9779-15ee85d9dc46
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ee8b6857-9060-45b2-9779-15ee85d9dc46","subject":"Error contract","status":"open","region":"eu","participants":["qa-6805da21e8fe","qa-692d350be09b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:58.557645282Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e574c8c7-3460-40e1-a963-e1985047101a

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: fc886cf5-7118-440b-9c78-843dbc4daa64
X-Correlation-Id: qa-e574c8c7-3460-40e1-a963-e1985047101a
Content-Type: application/json

--- response: 503 in 14 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e574c8c7-3460-40e1-a963-e1985047101a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-e574c8c7-3460-40e1-a963-e1985047101a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2292e67f-3856-4da7-abdf-e8b8168a9191

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2292e67f-3856-4da7-abdf-e8b8168a9191
Content-Type: application/json

--- request body ---
{"handle":"qa-692d350be09b","password":"****"}

--- response: 200 in 45 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-2292e67f-3856-4da7-abdf-e8b8168a9191
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 439
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_64954155-79f0-41b1-9135-8923a0d613a6"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-854ede25-b936-4099-a8aa-bac5ea067bd7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-854ede25-b936-4099-a8aa-bac5ea067bd7
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-854ede25-b936-4099-a8aa-bac5ea067bd7
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
correlation: qa-564933f3-8837-46e5-943a-f100b132085b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-564933f3-8837-46e5-943a-f100b132085b
Content-Type: application/json

--- request body ---
{"handle":"qa-692d350be09b","password":"****"}

--- response: 401 in 36 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-564933f3-8837-46e5-943a-f100b132085b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-564933f3-8837-46e5-943a-f100b132085b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2cb84fcb-543b-4585-b4a2-902c8060ee80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2cb84fcb-543b-4585-b4a2-902c8060ee80
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2cb84fcb-543b-4585-b4a2-902c8060ee80
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
correlation: qa-ddf3ebf5-debb-4b37-be73-b4f25e473bff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddf3ebf5-debb-4b37-be73-b4f25e473bff
Content-Type: application/json

--- request body ---
{"handle":"qa-6805da21e8fe","password":"****"}

--- response: 401 in 46 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ddf3ebf5-debb-4b37-be73-b4f25e473bff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 411
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ddf3ebf5-debb-4b37-be73-b4f25e473bff"}
```

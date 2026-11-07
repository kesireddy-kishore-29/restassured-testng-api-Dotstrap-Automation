# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[10]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-1b9e29f4-2340-4dc1-a896-f58459cbe503` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-80e5e9c9-d403-4c1c-86be-134037d3db6c` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-86952d1d-1d52-4636-b35d-030e1d6c786b` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-70ac426f-259a-4848-a593-daa5b04ca800` |
| 5 | `POST /v1/conversations/{id}/messages` | 503 | 14 | `qa-ffae88b8-3197-418f-8646-4abef719ec60` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-9856e11a-4854-4a41-97bc-02b768bfddf4` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-e819dd36-0f04-4572-9cad-8c7933836285` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-aeab3b30-a8c0-4f58-af07-58d6521df206` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-26cba02a-9d85-4f54-879e-23b4f7038fa3` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-a5c0aa49-bb32-4273-bb89-aa408f014934` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1b9e29f4-2340-4dc1-a896-f58459cbe503

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b9e29f4-2340-4dc1-a896-f58459cbe503
Content-Type: application/json

--- request body ---
{"handle":"qa-578b33ca381d","displayName":"QA 578b33ca381d","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b9e29f4-2340-4dc1-a896-f58459cbe503
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 437
RateLimit-Reset: 8
Location: /v1/accounts/qa-578b33ca381d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5359d49c-71d8-42fe-a188-7db1a1dc1457","handle":"qa-578b33ca381d","displayName":"QA 578b33ca381d","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.791968434Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-80e5e9c9-d403-4c1c-86be-134037d3db6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80e5e9c9-d403-4c1c-86be-134037d3db6c
Content-Type: application/json

--- request body ---
{"handle":"qa-666f49d54884","displayName":"QA 666f49d54884","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-80e5e9c9-d403-4c1c-86be-134037d3db6c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 426
RateLimit-Reset: 8
Location: /v1/accounts/qa-666f49d54884
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ed09b925-5f85-40dc-bd43-78882fbad70b","handle":"qa-666f49d54884","displayName":"QA 666f49d54884","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.834996720Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-86952d1d-1d52-4636-b35d-030e1d6c786b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86952d1d-1d52-4636-b35d-030e1d6c786b
Content-Type: application/json

--- request body ---
{"handle":"qa-578b33ca381d","password":"****"}

--- response: 200 in 36 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-86952d1d-1d52-4636-b35d-030e1d6c786b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 416
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5359d49c-71d8-42fe-a188-7db1a1dc1457"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-70ac426f-259a-4848-a593-daa5b04ca800

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70ac426f-259a-4848-a593-daa5b04ca800
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-666f49d54884","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-70ac426f-259a-4848-a593-daa5b04ca800
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
Location: /v1/conversations/cnv_80ba5cbe-8bac-4557-9559-c1d3eaba6c32
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_80ba5cbe-8bac-4557-9559-c1d3eaba6c32","subject":"Error contract","status":"open","region":"eu","participants":["qa-578b33ca381d","qa-666f49d54884"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:36.926639041Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_80ba5cbe-8bac-4557-9559-c1d3eaba6c32/messages
correlation: qa-ffae88b8-3197-418f-8646-4abef719ec60

--- request headers ---
Accept: application/json
X-Fault-Key: 643f7b73-5c94-4473-8c34-65669bea3128
X-Fault: unavailable-once
X-Correlation-Id: qa-ffae88b8-3197-418f-8646-4abef719ec60
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 503 in 14 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ffae88b8-3197-418f-8646-4abef719ec60
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_80ba5cbe-8bac-4557-9559-c1d3eaba6c32/messages","correlationId":"qa-ffae88b8-3197-418f-8646-4abef719ec60"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9856e11a-4854-4a41-97bc-02b768bfddf4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9856e11a-4854-4a41-97bc-02b768bfddf4
Content-Type: application/json

--- request body ---
{"handle":"qa-666f49d54884","password":"****"}

--- response: 200 in 19 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-9856e11a-4854-4a41-97bc-02b768bfddf4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 405
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ed09b925-5f85-40dc-bd43-78882fbad70b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e819dd36-0f04-4572-9cad-8c7933836285

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e819dd36-0f04-4572-9cad-8c7933836285
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e819dd36-0f04-4572-9cad-8c7933836285
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
correlation: qa-aeab3b30-a8c0-4f58-af07-58d6521df206

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aeab3b30-a8c0-4f58-af07-58d6521df206
Content-Type: application/json

--- request body ---
{"handle":"qa-666f49d54884","password":"****"}

--- response: 401 in 11 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aeab3b30-a8c0-4f58-af07-58d6521df206
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 398
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-aeab3b30-a8c0-4f58-af07-58d6521df206"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-26cba02a-9d85-4f54-879e-23b4f7038fa3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26cba02a-9d85-4f54-879e-23b4f7038fa3
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-26cba02a-9d85-4f54-879e-23b4f7038fa3
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
correlation: qa-a5c0aa49-bb32-4273-bb89-aa408f014934

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5c0aa49-bb32-4273-bb89-aa408f014934
Content-Type: application/json

--- request body ---
{"handle":"qa-578b33ca381d","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a5c0aa49-bb32-4273-bb89-aa408f014934
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 393
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a5c0aa49-bb32-4273-bb89-aa408f014934"}
```

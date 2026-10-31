# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/accounts]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[1]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-167598ec-257c-4211-9a6f-98eefde3e62f` |
| 2 | `POST /v1/accounts` | 201 | 50 | `qa-3a3c1a04-bc30-47af-b5f9-2475a6f2e4e5` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-149b5e4f-d2d5-4d5f-ba39-4e63a938e5e2` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-612d1a77-4ea1-4cca-aa69-001200cc27bb` |
| 5 | `POST /v1/accounts` | 503 | 13 | `qa-9f2fb40d-0a80-4246-a6d3-9481012f3976` |
| 6 | `POST /v1/auth/token` | 200 | 39 | `qa-9474db38-39ff-451d-91b2-264dc4af3fbd` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-f06c985d-2b38-4e45-bec2-194ee899d3a9` |
| 8 | `POST /v1/auth/token` | 401 | 31 | `qa-860959ec-9881-423d-821f-3f6443addf06` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-a29cacd8-3eab-4032-bddc-ac0c16e593b2` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-f7aeb987-0d21-4968-bf58-1563567ca91d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-167598ec-257c-4211-9a6f-98eefde3e62f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-167598ec-257c-4211-9a6f-98eefde3e62f
Content-Type: application/json

--- request body ---
{"handle":"qa-b28d86fc4d27","displayName":"QA b28d86fc4d27","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-167598ec-257c-4211-9a6f-98eefde3e62f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 10
Location: /v1/accounts/qa-b28d86fc4d27
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fa9f8b8d-1185-49c8-9b9b-7314a791e92c","handle":"qa-b28d86fc4d27","displayName":"QA b28d86fc4d27","region":"eu","role":"user","createdAt":"2026-10-26T07:54:46.267676110Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3a3c1a04-bc30-47af-b5f9-2475a6f2e4e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a3c1a04-bc30-47af-b5f9-2475a6f2e4e5
Content-Type: application/json

--- request body ---
{"handle":"qa-41ab2e247c3a","displayName":"QA 41ab2e247c3a","password":"****","region":"eu"}

--- response: 201 in 50 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a3c1a04-bc30-47af-b5f9-2475a6f2e4e5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 10
Location: /v1/accounts/qa-41ab2e247c3a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e593360d-8c93-4b9a-a359-17676803fbcc","handle":"qa-41ab2e247c3a","displayName":"QA 41ab2e247c3a","region":"eu","role":"user","createdAt":"2026-10-26T07:54:46.314538245Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-149b5e4f-d2d5-4d5f-ba39-4e63a938e5e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-149b5e4f-d2d5-4d5f-ba39-4e63a938e5e2
Content-Type: application/json

--- request body ---
{"handle":"qa-b28d86fc4d27","password":"****"}

--- response: 200 in 36 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-149b5e4f-d2d5-4d5f-ba39-4e63a938e5e2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 551
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fa9f8b8d-1185-49c8-9b9b-7314a791e92c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-612d1a77-4ea1-4cca-aa69-001200cc27bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-612d1a77-4ea1-4cca-aa69-001200cc27bb
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-41ab2e247c3a","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-612d1a77-4ea1-4cca-aa69-001200cc27bb
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
Location: /v1/conversations/cnv_ac6564d1-019c-4fe8-9a05-4073ef496b6c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ac6564d1-019c-4fe8-9a05-4073ef496b6c","subject":"Error contract","status":"open","region":"eu","participants":["qa-b28d86fc4d27","qa-41ab2e247c3a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:46.416640010Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-9f2fb40d-0a80-4246-a6d3-9481012f3976

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: b7df2f10-28cb-4394-afb7-fec583f190a1
X-Correlation-Id: qa-9f2fb40d-0a80-4246-a6d3-9481012f3976
Content-Type: application/json

--- request body ---
{"handle":"qa-f7c9f26f9c7d","displayName":"QA f7c9f26f9c7d","password":"****","region":"eu"}

--- response: 503 in 13 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9f2fb40d-0a80-4246-a6d3-9481012f3976
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 256

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts","correlationId":"qa-9f2fb40d-0a80-4246-a6d3-9481012f3976"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9474db38-39ff-451d-91b2-264dc4af3fbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9474db38-39ff-451d-91b2-264dc4af3fbd
Content-Type: application/json

--- request body ---
{"handle":"qa-41ab2e247c3a","password":"****"}

--- response: 200 in 39 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-9474db38-39ff-451d-91b2-264dc4af3fbd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 519
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e593360d-8c93-4b9a-a359-17676803fbcc"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f06c985d-2b38-4e45-bec2-194ee899d3a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f06c985d-2b38-4e45-bec2-194ee899d3a9
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f06c985d-2b38-4e45-bec2-194ee899d3a9
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
correlation: qa-860959ec-9881-423d-821f-3f6443addf06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-860959ec-9881-423d-821f-3f6443addf06
Content-Type: application/json

--- request body ---
{"handle":"qa-41ab2e247c3a","password":"****"}

--- response: 401 in 31 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-860959ec-9881-423d-821f-3f6443addf06
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 503
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-860959ec-9881-423d-821f-3f6443addf06"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a29cacd8-3eab-4032-bddc-ac0c16e593b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a29cacd8-3eab-4032-bddc-ac0c16e593b2
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a29cacd8-3eab-4032-bddc-ac0c16e593b2
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
correlation: qa-f7aeb987-0d21-4968-bf58-1563567ca91d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7aeb987-0d21-4968-bf58-1563567ca91d
Content-Type: application/json

--- request body ---
{"handle":"qa-b28d86fc4d27","password":"****"}

--- response: 401 in 16 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f7aeb987-0d21-4968-bf58-1563567ca91d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 495
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f7aeb987-0d21-4968-bf58-1563567ca91d"}
```

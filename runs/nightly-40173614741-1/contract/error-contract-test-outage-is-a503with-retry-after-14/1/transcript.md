# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/ledger]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[14]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-016e5ca3-46b6-48f4-86b6-060d03261427` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-52d52f57-d659-46d3-a935-631db10cbbdf` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-3d8f989f-fc44-4a66-a31a-3bab7cb76d7b` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-4b25cb0e-f36e-4349-b070-e30f77a804f8` |
| 5 | `GET /v1/credits/ledger` | 503 | 15 | `qa-47334f18-34e8-413c-97d1-1f15fad95056` |
| 6 | `POST /v1/auth/token` | 200 | 8 | `qa-5c6f41fa-03a0-431b-93d1-d2b7068bc1fd` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-6ac0ad2d-a24d-4e5a-aaec-2c99f52c6d8d` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-a35658e0-4147-4f17-9199-71022de43011` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-d903a4eb-1b8d-41bb-bd64-c0252f157549` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-57410daa-9482-4cc5-84ce-bb2afc5c0570` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-016e5ca3-46b6-48f4-86b6-060d03261427

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-016e5ca3-46b6-48f4-86b6-060d03261427
Content-Type: application/json

--- request body ---
{"handle":"qa-85695c07a595","displayName":"QA 85695c07a595","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-016e5ca3-46b6-48f4-86b6-060d03261427
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 360
RateLimit-Reset: 7
Location: /v1/accounts/qa-85695c07a595
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4315256f-0186-4dcf-86b4-860c88ccd37b","handle":"qa-85695c07a595","displayName":"QA 85695c07a595","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.672333009Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-52d52f57-d659-46d3-a935-631db10cbbdf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52d52f57-d659-46d3-a935-631db10cbbdf
Content-Type: application/json

--- request body ---
{"handle":"qa-cfe55e31b6aa","displayName":"QA cfe55e31b6aa","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-52d52f57-d659-46d3-a935-631db10cbbdf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 353
RateLimit-Reset: 7
Location: /v1/accounts/qa-cfe55e31b6aa
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3cc91555-ba61-4224-a82e-cf3e8f983d04","handle":"qa-cfe55e31b6aa","displayName":"QA cfe55e31b6aa","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.708463758Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3d8f989f-fc44-4a66-a31a-3bab7cb76d7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d8f989f-fc44-4a66-a31a-3bab7cb76d7b
Content-Type: application/json

--- request body ---
{"handle":"qa-85695c07a595","password":"****"}

--- response: 200 in 24 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d8f989f-fc44-4a66-a31a-3bab7cb76d7b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 349
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4315256f-0186-4dcf-86b4-860c88ccd37b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4b25cb0e-f36e-4349-b070-e30f77a804f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b25cb0e-f36e-4349-b070-e30f77a804f8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-cfe55e31b6aa","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b25cb0e-f36e-4349-b070-e30f77a804f8
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
Location: /v1/conversations/cnv_332cd950-3a19-433f-bde2-807b25e0718b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_332cd950-3a19-433f-bde2-807b25e0718b","subject":"Error contract","status":"open","region":"eu","participants":["qa-85695c07a595","qa-cfe55e31b6aa"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:26.764269526Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-47334f18-34e8-413c-97d1-1f15fad95056

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 24e3ef9b-4eb2-4590-abeb-689c24d85e95
X-Correlation-Id: qa-47334f18-34e8-413c-97d1-1f15fad95056
Content-Type: application/json

--- response: 503 in 15 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-47334f18-34e8-413c-97d1-1f15fad95056
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 262

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/ledger","correlationId":"qa-47334f18-34e8-413c-97d1-1f15fad95056"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5c6f41fa-03a0-431b-93d1-d2b7068bc1fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c6f41fa-03a0-431b-93d1-d2b7068bc1fd
Content-Type: application/json

--- request body ---
{"handle":"qa-cfe55e31b6aa","password":"****"}

--- response: 200 in 8 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c6f41fa-03a0-431b-93d1-d2b7068bc1fd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 337
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3cc91555-ba61-4224-a82e-cf3e8f983d04"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6ac0ad2d-a24d-4e5a-aaec-2c99f52c6d8d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ac0ad2d-a24d-4e5a-aaec-2c99f52c6d8d
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6ac0ad2d-a24d-4e5a-aaec-2c99f52c6d8d
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
correlation: qa-a35658e0-4147-4f17-9199-71022de43011

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a35658e0-4147-4f17-9199-71022de43011
Content-Type: application/json

--- request body ---
{"handle":"qa-cfe55e31b6aa","password":"****"}

--- response: 401 in 19 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a35658e0-4147-4f17-9199-71022de43011
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 334
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a35658e0-4147-4f17-9199-71022de43011"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d903a4eb-1b8d-41bb-bd64-c0252f157549

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d903a4eb-1b8d-41bb-bd64-c0252f157549
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d903a4eb-1b8d-41bb-bd64-c0252f157549
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
correlation: qa-57410daa-9482-4cc5-84ce-bb2afc5c0570

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57410daa-9482-4cc5-84ce-bb2afc5c0570
Content-Type: application/json

--- request body ---
{"handle":"qa-85695c07a595","password":"****"}

--- response: 401 in 17 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-57410daa-9482-4cc5-84ce-bb2afc5c0570
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 329
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-57410daa-9482-4cc5-84ce-bb2afc5c0570"}
```

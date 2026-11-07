# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[3]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 360 | `qa-9e619f78-f89d-4f74-a5cf-637ebc2fb553` |
| 2 | `POST /v1/accounts` | 201 | 47 | `qa-b54a95e2-4fbd-462d-ab1e-d1b4b144be41` |
| 3 | `POST /v1/accounts` | 201 | 42 | `qa-2eedaeaa-b7a8-4946-9705-f8e007077cc2` |
| 4 | `POST /v1/auth/token` | 200 | 28 | `qa-39909866-c1e6-4154-b31b-b1ef3186c96f` |
| 5 | `POST /v1/conversations` | 201 | 55 | `qa-09007593-2546-480f-b478-4ec6efed5746` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-adcb6120-3625-456e-b07f-d8c27abe7eef` |
| 7 | `POST /v1/conversations/{id}/read` | 403 | 14 | `qa-b118e803-015f-4084-aa19-cff299cee989` |
| 8 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-290b22eb-bb8e-4536-b578-3efa48f8aae1` |
| 9 | `POST /v1/auth/token` | 401 | 14 | `qa-4b6bf5e4-8f4f-44b2-a927-e59cb95ff0f1` |
| 10 | `POST /v1/auth/token` | 200 | 42 | `qa-8717aad2-f803-4058-bdd2-323afdc2f9d7` |
| 11 | `DELETE /v1/accounts/me` | 204 | 38 | `qa-0392a6bb-46a5-4bb1-b608-f7266aa495bf` |
| 12 | `POST /v1/auth/token` | 401 | 54 | `qa-0b43e5b3-d3e0-4109-a654-7edfb17cbe97` |
| 13 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-ecdbcc8c-0b1b-4481-96f4-bd9dd2934b76` |
| 14 | `POST /v1/auth/token` | 401 | 27 | `qa-a0ca32ab-7f92-40d9-b4d6-8c32808939eb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9e619f78-f89d-4f74-a5cf-637ebc2fb553

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e619f78-f89d-4f74-a5cf-637ebc2fb553
Content-Type: application/json

--- request body ---
{"handle":"qa-4011974e4393","displayName":"QA 4011974e4393","password":"****","region":"eu"}

--- response: 201 in 360 ms ---
Date: Mon, 02 Nov 2026 09:38:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e619f78-f89d-4f74-a5cf-637ebc2fb553
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Location: /v1/accounts/qa-4011974e4393
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4dbc5cfe-a570-4e06-83fa-6381db9855c8","handle":"qa-4011974e4393","displayName":"QA 4011974e4393","region":"eu","role":"user","createdAt":"2026-11-02T09:38:34.624696133Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b54a95e2-4fbd-462d-ab1e-d1b4b144be41

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b54a95e2-4fbd-462d-ab1e-d1b4b144be41
Content-Type: application/json

--- request body ---
{"handle":"qa-6f79b5c52b2d","displayName":"QA 6f79b5c52b2d","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Mon, 02 Nov 2026 09:38:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-b54a95e2-4fbd-462d-ab1e-d1b4b144be41
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
Location: /v1/accounts/qa-6f79b5c52b2d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a04d5ed3-fa1d-4294-bf69-af20e0b16bc4","handle":"qa-6f79b5c52b2d","displayName":"QA 6f79b5c52b2d","region":"eu","role":"user","createdAt":"2026-11-02T09:38:34.982846679Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-2eedaeaa-b7a8-4946-9705-f8e007077cc2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2eedaeaa-b7a8-4946-9705-f8e007077cc2
Content-Type: application/json

--- request body ---
{"handle":"qa-6fb8cf133fcf","displayName":"QA 6fb8cf133fcf","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-2eedaeaa-b7a8-4946-9705-f8e007077cc2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 10
Location: /v1/accounts/qa-6fb8cf133fcf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8602024e-82cd-4ff3-8f60-1e27067ace89","handle":"qa-6fb8cf133fcf","displayName":"QA 6fb8cf133fcf","region":"eu","role":"user","createdAt":"2026-11-02T09:38:35.063442084Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-39909866-c1e6-4154-b31b-b1ef3186c96f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39909866-c1e6-4154-b31b-b1ef3186c96f
Content-Type: application/json

--- request body ---
{"handle":"qa-4011974e4393","password":"****"}

--- response: 200 in 28 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-39909866-c1e6-4154-b31b-b1ef3186c96f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4dbc5cfe-a570-4e06-83fa-6381db9855c8"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-09007593-2546-480f-b478-4ec6efed5746

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09007593-2546-480f-b478-4ec6efed5746
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6f79b5c52b2d","subject":"Error contract","message":"Hi"}

--- response: 201 in 55 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-09007593-2546-480f-b478-4ec6efed5746
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
Location: /v1/conversations/cnv_f403b5cb-2515-4f1a-ae21-55091fecbdb2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f403b5cb-2515-4f1a-ae21-55091fecbdb2","subject":"Error contract","status":"open","region":"eu","participants":["qa-4011974e4393","qa-6f79b5c52b2d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:35.186789519Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-adcb6120-3625-456e-b07f-d8c27abe7eef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-adcb6120-3625-456e-b07f-d8c27abe7eef
Content-Type: application/json

--- request body ---
{"handle":"qa-6fb8cf133fcf","password":"****"}

--- response: 200 in 26 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-adcb6120-3625-456e-b07f-d8c27abe7eef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 555
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8602024e-82cd-4ff3-8f60-1e27067ace89"}
```

## 7. POST /v1/conversations/{id}/read

```text
#7 POST http://localhost:7070/v1/conversations/cnv_f403b5cb-2515-4f1a-ae21-55091fecbdb2/read
correlation: qa-b118e803-015f-4084-aa19-cff299cee989

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b118e803-015f-4084-aa19-cff299cee989
Content-Type: application/json

--- response: 403 in 14 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b118e803-015f-4084-aa19-cff299cee989
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
Content-Length: 290

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_f403b5cb-2515-4f1a-ae21-55091fecbdb2/read","correlationId":"qa-b118e803-015f-4084-aa19-cff299cee989"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-290b22eb-bb8e-4536-b578-3efa48f8aae1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-290b22eb-bb8e-4536-b578-3efa48f8aae1
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-290b22eb-bb8e-4536-b578-3efa48f8aae1
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-4b6bf5e4-8f4f-44b2-a927-e59cb95ff0f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b6bf5e4-8f4f-44b2-a927-e59cb95ff0f1
Content-Type: application/json

--- request body ---
{"handle":"qa-6fb8cf133fcf","password":"****"}

--- response: 401 in 14 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4b6bf5e4-8f4f-44b2-a927-e59cb95ff0f1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 538
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4b6bf5e4-8f4f-44b2-a927-e59cb95ff0f1"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-8717aad2-f803-4058-bdd2-323afdc2f9d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8717aad2-f803-4058-bdd2-323afdc2f9d7
Content-Type: application/json

--- request body ---
{"handle":"qa-6f79b5c52b2d","password":"****"}

--- response: 200 in 42 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-8717aad2-f803-4058-bdd2-323afdc2f9d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 531
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a04d5ed3-fa1d-4294-bf69-af20e0b16bc4"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0392a6bb-46a5-4bb1-b608-f7266aa495bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0392a6bb-46a5-4bb1-b608-f7266aa495bf
Content-Type: application/json

--- response: 204 in 38 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0392a6bb-46a5-4bb1-b608-f7266aa495bf
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-0b43e5b3-d3e0-4109-a654-7edfb17cbe97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b43e5b3-d3e0-4109-a654-7edfb17cbe97
Content-Type: application/json

--- request body ---
{"handle":"qa-6f79b5c52b2d","password":"****"}

--- response: 401 in 54 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0b43e5b3-d3e0-4109-a654-7edfb17cbe97
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 514
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0b43e5b3-d3e0-4109-a654-7edfb17cbe97"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ecdbcc8c-0b1b-4481-96f4-bd9dd2934b76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecdbcc8c-0b1b-4481-96f4-bd9dd2934b76
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ecdbcc8c-0b1b-4481-96f4-bd9dd2934b76
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-a0ca32ab-7f92-40d9-b4d6-8c32808939eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0ca32ab-7f92-40d9-b4d6-8c32808939eb
Content-Type: application/json

--- request body ---
{"handle":"qa-4011974e4393","password":"****"}

--- response: 401 in 27 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a0ca32ab-7f92-40d9-b4d6-8c32808939eb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 507
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a0ca32ab-7f92-40d9-b4d6-8c32808939eb"}
```

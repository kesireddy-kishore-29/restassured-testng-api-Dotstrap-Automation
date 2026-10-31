# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[2]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-7d9fdb34-4e3f-4b20-a83c-45309c6e2cc0` |
| 2 | `POST /v1/accounts` | 201 | 50 | `qa-712f152d-5d19-4b46-bfc6-dc5428fddfdc` |
| 3 | `POST /v1/accounts` | 201 | 31 | `qa-ff42c9fe-f8ad-4036-b7fa-6f8cc0895cc8` |
| 4 | `POST /v1/auth/token` | 200 | 48 | `qa-cdc543b4-cad7-4c3d-98dd-9185dea75e44` |
| 5 | `POST /v1/conversations` | 201 | 13 | `qa-1a772031-15e6-4f4b-9e41-55c4fdeb10fc` |
| 6 | `POST /v1/auth/token` | 200 | 41 | `qa-58456e73-4796-46e2-9bca-096546fbade4` |
| 7 | `POST /v1/conversations/{id}/messages` | 403 | 12 | `qa-09ceeeeb-77a4-4c35-a4c0-60e99cf70239` |
| 8 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-27e958ac-2aa1-4ad4-9db8-811920fd9a49` |
| 9 | `POST /v1/auth/token` | 401 | 19 | `qa-42de83de-6d2f-4b3e-a28a-4da294488ce3` |
| 10 | `POST /v1/auth/token` | 200 | 66 | `qa-a6727aa5-61c9-406b-9939-b6f2b6ca7ab4` |
| 11 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-b283f8ed-a27f-4a53-a02e-9cf86feb13df` |
| 12 | `POST /v1/auth/token` | 401 | 35 | `qa-fccece23-764b-4da0-b525-afcb59400896` |
| 13 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-78de4c45-cd82-4dba-b90d-6d678ca2a9b0` |
| 14 | `POST /v1/auth/token` | 401 | 31 | `qa-ae9e02a3-9a8b-4593-8f68-ac3101c2f5bd` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7d9fdb34-4e3f-4b20-a83c-45309c6e2cc0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d9fdb34-4e3f-4b20-a83c-45309c6e2cc0
Content-Type: application/json

--- request body ---
{"handle":"qa-ad5422692cdc","displayName":"QA ad5422692cdc","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d9fdb34-4e3f-4b20-a83c-45309c6e2cc0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 542
RateLimit-Reset: 9
Location: /v1/accounts/qa-ad5422692cdc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_25a0cbe8-027e-4767-9b3b-40bda20a16ef","handle":"qa-ad5422692cdc","displayName":"QA ad5422692cdc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:24.285506332Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-712f152d-5d19-4b46-bfc6-dc5428fddfdc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-712f152d-5d19-4b46-bfc6-dc5428fddfdc
Content-Type: application/json

--- request body ---
{"handle":"qa-6fe169911ba8","displayName":"QA 6fe169911ba8","password":"****","region":"eu"}

--- response: 201 in 50 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-712f152d-5d19-4b46-bfc6-dc5428fddfdc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 539
RateLimit-Reset: 9
Location: /v1/accounts/qa-6fe169911ba8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0f313f07-7c96-4ab5-aa75-e7906819022a","handle":"qa-6fe169911ba8","displayName":"QA 6fe169911ba8","region":"eu","role":"user","createdAt":"2026-10-25T07:40:24.334145788Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-ff42c9fe-f8ad-4036-b7fa-6f8cc0895cc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff42c9fe-f8ad-4036-b7fa-6f8cc0895cc8
Content-Type: application/json

--- request body ---
{"handle":"qa-ca7e314b8005","displayName":"QA ca7e314b8005","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff42c9fe-f8ad-4036-b7fa-6f8cc0895cc8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 533
RateLimit-Reset: 9
Location: /v1/accounts/qa-ca7e314b8005
X-Served-Region: eu
Content-Length: 181

{"id":"acc_38493257-cffb-421a-817f-e1c4f673f4fb","handle":"qa-ca7e314b8005","displayName":"QA ca7e314b8005","region":"eu","role":"user","createdAt":"2026-10-25T07:40:24.391557938Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-cdc543b4-cad7-4c3d-98dd-9185dea75e44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cdc543b4-cad7-4c3d-98dd-9185dea75e44
Content-Type: application/json

--- request body ---
{"handle":"qa-ad5422692cdc","password":"****"}

--- response: 200 in 48 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-cdc543b4-cad7-4c3d-98dd-9185dea75e44
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 530
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_25a0cbe8-027e-4767-9b3b-40bda20a16ef"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-1a772031-15e6-4f4b-9e41-55c4fdeb10fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a772031-15e6-4f4b-9e41-55c4fdeb10fc
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6fe169911ba8","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a772031-15e6-4f4b-9e41-55c4fdeb10fc
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
Location: /v1/conversations/cnv_bcddd09a-01b0-4632-813f-3ee5c2f241e8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_bcddd09a-01b0-4632-813f-3ee5c2f241e8","subject":"Error contract","status":"open","region":"eu","participants":["qa-ad5422692cdc","qa-6fe169911ba8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:24.469086690Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-58456e73-4796-46e2-9bca-096546fbade4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58456e73-4796-46e2-9bca-096546fbade4
Content-Type: application/json

--- request body ---
{"handle":"qa-ca7e314b8005","password":"****"}

--- response: 200 in 41 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-58456e73-4796-46e2-9bca-096546fbade4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 526
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_38493257-cffb-421a-817f-e1c4f673f4fb"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_bcddd09a-01b0-4632-813f-3ee5c2f241e8/messages
correlation: qa-09ceeeeb-77a4-4c35-a4c0-60e99cf70239

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09ceeeeb-77a4-4c35-a4c0-60e99cf70239
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 403 in 12 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-09ceeeeb-77a4-4c35-a4c0-60e99cf70239
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_bcddd09a-01b0-4632-813f-3ee5c2f241e8/messages","correlationId":"qa-09ceeeeb-77a4-4c35-a4c0-60e99cf70239"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-27e958ac-2aa1-4ad4-9db8-811920fd9a49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27e958ac-2aa1-4ad4-9db8-811920fd9a49
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-27e958ac-2aa1-4ad4-9db8-811920fd9a49
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
correlation: qa-42de83de-6d2f-4b3e-a28a-4da294488ce3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42de83de-6d2f-4b3e-a28a-4da294488ce3
Content-Type: application/json

--- request body ---
{"handle":"qa-ca7e314b8005","password":"****"}

--- response: 401 in 19 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-42de83de-6d2f-4b3e-a28a-4da294488ce3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 510
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-42de83de-6d2f-4b3e-a28a-4da294488ce3"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-a6727aa5-61c9-406b-9939-b6f2b6ca7ab4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6727aa5-61c9-406b-9939-b6f2b6ca7ab4
Content-Type: application/json

--- request body ---
{"handle":"qa-6fe169911ba8","password":"****"}

--- response: 200 in 66 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6727aa5-61c9-406b-9939-b6f2b6ca7ab4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 505
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0f313f07-7c96-4ab5-aa75-e7906819022a"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b283f8ed-a27f-4a53-a02e-9cf86feb13df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b283f8ed-a27f-4a53-a02e-9cf86feb13df
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b283f8ed-a27f-4a53-a02e-9cf86feb13df
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
correlation: qa-fccece23-764b-4da0-b525-afcb59400896

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fccece23-764b-4da0-b525-afcb59400896
Content-Type: application/json

--- request body ---
{"handle":"qa-6fe169911ba8","password":"****"}

--- response: 401 in 35 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fccece23-764b-4da0-b525-afcb59400896
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 486
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fccece23-764b-4da0-b525-afcb59400896"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-78de4c45-cd82-4dba-b90d-6d678ca2a9b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78de4c45-cd82-4dba-b90d-6d678ca2a9b0
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-78de4c45-cd82-4dba-b90d-6d678ca2a9b0
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
correlation: qa-ae9e02a3-9a8b-4593-8f68-ac3101c2f5bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae9e02a3-9a8b-4593-8f68-ac3101c2f5bd
Content-Type: application/json

--- request body ---
{"handle":"qa-ad5422692cdc","password":"****"}

--- response: 401 in 31 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ae9e02a3-9a8b-4593-8f68-ac3101c2f5bd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 472
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ae9e02a3-9a8b-4593-8f68-ac3101c2f5bd"}
```

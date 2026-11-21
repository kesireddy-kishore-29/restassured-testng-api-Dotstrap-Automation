# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[0]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-2e52adec-1465-4db7-9218-81b7fa89063e` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-8bf5bdbe-2673-4d44-9fce-0e4c5dbbbde9` |
| 3 | `POST /v1/accounts` | 201 | 27 | `qa-d3e42565-7363-4578-b6bf-d8096331df61` |
| 4 | `POST /v1/auth/token` | 200 | 14 | `qa-ff5a8ea3-f40b-479a-95bb-0a0e4f471023` |
| 5 | `POST /v1/conversations` | 201 | 11 | `qa-a86f0832-f67c-481d-95fd-9e8de9057476` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-ee902234-4244-4de6-9cbe-ede7796c0a12` |
| 7 | `GET /v1/conversations/{id}` | 403 | 4 | `qa-7cea5c8e-647d-4b15-a227-40fee0529c36` |
| 8 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-872bf2e0-65fe-4ef5-9fd8-5e3b89dce391` |
| 9 | `POST /v1/auth/token` | 401 | 35 | `qa-48cca56e-37f5-4cb8-918f-912c166b94ee` |
| 10 | `POST /v1/auth/token` | 200 | 41 | `qa-21d4a356-e431-4b9f-b173-5726421f49d6` |
| 11 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-3924569a-a746-4f1f-b5fc-2a3003c9bed4` |
| 12 | `POST /v1/auth/token` | 401 | 29 | `qa-f658ffc6-0a2c-4e6a-b9df-bd5fb49d8605` |
| 13 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-46fb480d-5f7f-4a3a-a9f2-74fa7bfde072` |
| 14 | `POST /v1/auth/token` | 401 | 39 | `qa-df72c6e2-bec1-415f-ad3d-74aa0d2532b1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2e52adec-1465-4db7-9218-81b7fa89063e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e52adec-1465-4db7-9218-81b7fa89063e
Content-Type: application/json

--- request body ---
{"handle":"qa-7750f75ada25","displayName":"QA 7750f75ada25","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e52adec-1465-4db7-9218-81b7fa89063e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 544
RateLimit-Reset: 9
Location: /v1/accounts/qa-7750f75ada25
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e83ce433-9fd0-4563-a5e8-219112b6cc0d","handle":"qa-7750f75ada25","displayName":"QA 7750f75ada25","region":"eu","role":"user","createdAt":"2026-11-16T09:53:52.092782215Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8bf5bdbe-2673-4d44-9fce-0e4c5dbbbde9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bf5bdbe-2673-4d44-9fce-0e4c5dbbbde9
Content-Type: application/json

--- request body ---
{"handle":"qa-376b99ec785f","displayName":"QA 376b99ec785f","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-8bf5bdbe-2673-4d44-9fce-0e4c5dbbbde9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 540
RateLimit-Reset: 9
Location: /v1/accounts/qa-376b99ec785f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7eab45e4-dce6-4d72-be48-050608235b45","handle":"qa-376b99ec785f","displayName":"QA 376b99ec785f","region":"eu","role":"user","createdAt":"2026-11-16T09:53:52.140451758Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-d3e42565-7363-4578-b6bf-d8096331df61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3e42565-7363-4578-b6bf-d8096331df61
Content-Type: application/json

--- request body ---
{"handle":"qa-2ed9e7edad43","displayName":"QA 2ed9e7edad43","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3e42565-7363-4578-b6bf-d8096331df61
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 535
RateLimit-Reset: 9
Location: /v1/accounts/qa-2ed9e7edad43
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0d4e759a-9674-417a-a20f-a4619ce3955b","handle":"qa-2ed9e7edad43","displayName":"QA 2ed9e7edad43","region":"eu","role":"user","createdAt":"2026-11-16T09:53:52.178259780Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-ff5a8ea3-f40b-479a-95bb-0a0e4f471023

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff5a8ea3-f40b-479a-95bb-0a0e4f471023
Content-Type: application/json

--- request body ---
{"handle":"qa-7750f75ada25","password":"****"}

--- response: 200 in 14 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff5a8ea3-f40b-479a-95bb-0a0e4f471023
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e83ce433-9fd0-4563-a5e8-219112b6cc0d"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-a86f0832-f67c-481d-95fd-9e8de9057476

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a86f0832-f67c-481d-95fd-9e8de9057476
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-376b99ec785f","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-a86f0832-f67c-481d-95fd-9e8de9057476
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
Location: /v1/conversations/cnv_164cf5cd-d6c9-4c33-aae9-9d9a95357b5b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_164cf5cd-d6c9-4c33-aae9-9d9a95357b5b","subject":"Error contract","status":"open","region":"eu","participants":["qa-7750f75ada25","qa-376b99ec785f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:52.222698948Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ee902234-4244-4de6-9cbe-ede7796c0a12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee902234-4244-4de6-9cbe-ede7796c0a12
Content-Type: application/json

--- request body ---
{"handle":"qa-2ed9e7edad43","password":"****"}

--- response: 200 in 33 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee902234-4244-4de6-9cbe-ede7796c0a12
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 529
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0d4e759a-9674-417a-a20f-a4619ce3955b"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_164cf5cd-d6c9-4c33-aae9-9d9a95357b5b
correlation: qa-7cea5c8e-647d-4b15-a227-40fee0529c36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7cea5c8e-647d-4b15-a227-40fee0529c36
Content-Type: application/json

--- response: 403 in 4 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7cea5c8e-647d-4b15-a227-40fee0529c36
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
Content-Length: 285

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_164cf5cd-d6c9-4c33-aae9-9d9a95357b5b","correlationId":"qa-7cea5c8e-647d-4b15-a227-40fee0529c36"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-872bf2e0-65fe-4ef5-9fd8-5e3b89dce391

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-872bf2e0-65fe-4ef5-9fd8-5e3b89dce391
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-872bf2e0-65fe-4ef5-9fd8-5e3b89dce391
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
correlation: qa-48cca56e-37f5-4cb8-918f-912c166b94ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48cca56e-37f5-4cb8-918f-912c166b94ee
Content-Type: application/json

--- request body ---
{"handle":"qa-2ed9e7edad43","password":"****"}

--- response: 401 in 35 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-48cca56e-37f5-4cb8-918f-912c166b94ee
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-48cca56e-37f5-4cb8-918f-912c166b94ee"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-21d4a356-e431-4b9f-b173-5726421f49d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21d4a356-e431-4b9f-b173-5726421f49d6
Content-Type: application/json

--- request body ---
{"handle":"qa-376b99ec785f","password":"****"}

--- response: 200 in 41 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-21d4a356-e431-4b9f-b173-5726421f49d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 508
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7eab45e4-dce6-4d72-be48-050608235b45"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3924569a-a746-4f1f-b5fc-2a3003c9bed4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3924569a-a746-4f1f-b5fc-2a3003c9bed4
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3924569a-a746-4f1f-b5fc-2a3003c9bed4
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
correlation: qa-f658ffc6-0a2c-4e6a-b9df-bd5fb49d8605

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f658ffc6-0a2c-4e6a-b9df-bd5fb49d8605
Content-Type: application/json

--- request body ---
{"handle":"qa-376b99ec785f","password":"****"}

--- response: 401 in 29 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f658ffc6-0a2c-4e6a-b9df-bd5fb49d8605
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 493
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f658ffc6-0a2c-4e6a-b9df-bd5fb49d8605"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-46fb480d-5f7f-4a3a-a9f2-74fa7bfde072

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46fb480d-5f7f-4a3a-a9f2-74fa7bfde072
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-46fb480d-5f7f-4a3a-a9f2-74fa7bfde072
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-df72c6e2-bec1-415f-ad3d-74aa0d2532b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df72c6e2-bec1-415f-ad3d-74aa0d2532b1
Content-Type: application/json

--- request body ---
{"handle":"qa-7750f75ada25","password":"****"}

--- response: 401 in 39 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-df72c6e2-bec1-415f-ad3d-74aa0d2532b1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 479
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-df72c6e2-bec1-415f-ad3d-74aa0d2532b1"}
```

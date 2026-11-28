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
| 1 | `POST /v1/accounts` | 201 | 39 | `qa-1e807225-c46e-4b83-b845-ad5a14078c14` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-99b41307-f216-4ba4-a039-0297a69a9871` |
| 3 | `POST /v1/accounts` | 201 | 19 | `qa-2be93aa8-46c8-42bf-8c1d-ffa0df2256d5` |
| 4 | `POST /v1/auth/token` | 200 | 9 | `qa-74813784-4132-496e-b927-94fe7667947d` |
| 5 | `POST /v1/conversations` | 201 | 13 | `qa-51a2c357-1bd4-43d9-a070-04b7d19be2a3` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-4f2c1ff5-d5a5-4167-9f40-d76009c6ee59` |
| 7 | `POST /v1/conversations/{id}/messages` | 403 | 29 | `qa-9c1b694b-d484-4880-9d19-672445c7f47d` |
| 8 | `DELETE /v1/accounts/me` | 204 | 37 | `qa-6fb444cf-1607-4fc1-9c9f-cb41236220b0` |
| 9 | `POST /v1/auth/token` | 401 | 22 | `qa-facf4141-0418-4a2e-abd4-880d41fe759d` |
| 10 | `POST /v1/auth/token` | 200 | 48 | `qa-ac9e4b1d-34f7-4e37-885c-6a649ac8e0ea` |
| 11 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-83ff08af-e6b8-4f46-9261-705b443c61a9` |
| 12 | `POST /v1/auth/token` | 401 | 31 | `qa-6d68f15e-a293-4c4f-a14f-3a3e5d297413` |
| 13 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-06ca6cad-5cad-4f10-aee8-dc3bcae6d036` |
| 14 | `POST /v1/auth/token` | 401 | 19 | `qa-a1a87b62-b47b-4446-9168-1f1ad065d323` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1e807225-c46e-4b83-b845-ad5a14078c14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e807225-c46e-4b83-b845-ad5a14078c14
Content-Type: application/json

--- request body ---
{"handle":"qa-75bb6280c0fc","displayName":"QA 75bb6280c0fc","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e807225-c46e-4b83-b845-ad5a14078c14
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 549
RateLimit-Reset: 10
Location: /v1/accounts/qa-75bb6280c0fc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f8b96571-7843-4bed-8663-236bd065017b","handle":"qa-75bb6280c0fc","displayName":"QA 75bb6280c0fc","region":"eu","role":"user","createdAt":"2026-11-25T11:27:57.322435642Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-99b41307-f216-4ba4-a039-0297a69a9871

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99b41307-f216-4ba4-a039-0297a69a9871
Content-Type: application/json

--- request body ---
{"handle":"qa-51fcbb4d776c","displayName":"QA 51fcbb4d776c","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-99b41307-f216-4ba4-a039-0297a69a9871
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 543
RateLimit-Reset: 10
Location: /v1/accounts/qa-51fcbb4d776c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_41694a40-cacc-4341-a27f-6fc0284222a4","handle":"qa-51fcbb4d776c","displayName":"QA 51fcbb4d776c","region":"eu","role":"user","createdAt":"2026-11-25T11:27:57.361199837Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-2be93aa8-46c8-42bf-8c1d-ffa0df2256d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2be93aa8-46c8-42bf-8c1d-ffa0df2256d5
Content-Type: application/json

--- request body ---
{"handle":"qa-3c42d9687ca1","displayName":"QA 3c42d9687ca1","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-2be93aa8-46c8-42bf-8c1d-ffa0df2256d5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 536
RateLimit-Reset: 9
Location: /v1/accounts/qa-3c42d9687ca1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fb6b0a97-020f-4809-b914-de2ae86f3946","handle":"qa-3c42d9687ca1","displayName":"QA 3c42d9687ca1","region":"eu","role":"user","createdAt":"2026-11-25T11:27:57.383903214Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-74813784-4132-496e-b927-94fe7667947d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74813784-4132-496e-b927-94fe7667947d
Content-Type: application/json

--- request body ---
{"handle":"qa-75bb6280c0fc","password":"****"}

--- response: 200 in 9 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-74813784-4132-496e-b927-94fe7667947d
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f8b96571-7843-4bed-8663-236bd065017b"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-51a2c357-1bd4-43d9-a070-04b7d19be2a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51a2c357-1bd4-43d9-a070-04b7d19be2a3
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-51fcbb4d776c","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-51a2c357-1bd4-43d9-a070-04b7d19be2a3
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
Location: /v1/conversations/cnv_33173b9b-23c6-4792-a7ac-ebedd9bc92d5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_33173b9b-23c6-4792-a7ac-ebedd9bc92d5","subject":"Error contract","status":"open","region":"eu","participants":["qa-75bb6280c0fc","qa-51fcbb4d776c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:57.439182883Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4f2c1ff5-d5a5-4167-9f40-d76009c6ee59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f2c1ff5-d5a5-4167-9f40-d76009c6ee59
Content-Type: application/json

--- request body ---
{"handle":"qa-3c42d9687ca1","password":"****"}

--- response: 200 in 22 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-4f2c1ff5-d5a5-4167-9f40-d76009c6ee59
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 528
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fb6b0a97-020f-4809-b914-de2ae86f3946"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_33173b9b-23c6-4792-a7ac-ebedd9bc92d5/messages
correlation: qa-9c1b694b-d484-4880-9d19-672445c7f47d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c1b694b-d484-4880-9d19-672445c7f47d
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 403 in 29 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9c1b694b-d484-4880-9d19-672445c7f47d
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_33173b9b-23c6-4792-a7ac-ebedd9bc92d5/messages","correlationId":"qa-9c1b694b-d484-4880-9d19-672445c7f47d"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6fb444cf-1607-4fc1-9c9f-cb41236220b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6fb444cf-1607-4fc1-9c9f-cb41236220b0
Content-Type: application/json

--- response: 204 in 37 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6fb444cf-1607-4fc1-9c9f-cb41236220b0
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
correlation: qa-facf4141-0418-4a2e-abd4-880d41fe759d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-facf4141-0418-4a2e-abd4-880d41fe759d
Content-Type: application/json

--- request body ---
{"handle":"qa-3c42d9687ca1","password":"****"}

--- response: 401 in 22 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-facf4141-0418-4a2e-abd4-880d41fe759d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 517
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-facf4141-0418-4a2e-abd4-880d41fe759d"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-ac9e4b1d-34f7-4e37-885c-6a649ac8e0ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac9e4b1d-34f7-4e37-885c-6a649ac8e0ea
Content-Type: application/json

--- request body ---
{"handle":"qa-51fcbb4d776c","password":"****"}

--- response: 200 in 48 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac9e4b1d-34f7-4e37-885c-6a649ac8e0ea
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_41694a40-cacc-4341-a27f-6fc0284222a4"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-83ff08af-e6b8-4f46-9261-705b443c61a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83ff08af-e6b8-4f46-9261-705b443c61a9
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-83ff08af-e6b8-4f46-9261-705b443c61a9
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
correlation: qa-6d68f15e-a293-4c4f-a14f-3a3e5d297413

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d68f15e-a293-4c4f-a14f-3a3e5d297413
Content-Type: application/json

--- request body ---
{"handle":"qa-51fcbb4d776c","password":"****"}

--- response: 401 in 31 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6d68f15e-a293-4c4f-a14f-3a3e5d297413
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 489
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6d68f15e-a293-4c4f-a14f-3a3e5d297413"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-06ca6cad-5cad-4f10-aee8-dc3bcae6d036

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06ca6cad-5cad-4f10-aee8-dc3bcae6d036
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-06ca6cad-5cad-4f10-aee8-dc3bcae6d036
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
correlation: qa-a1a87b62-b47b-4446-9168-1f1ad065d323

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1a87b62-b47b-4446-9168-1f1ad065d323
Content-Type: application/json

--- request body ---
{"handle":"qa-75bb6280c0fc","password":"****"}

--- response: 401 in 19 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a1a87b62-b47b-4446-9168-1f1ad065d323
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 476
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a1a87b62-b47b-4446-9168-1f1ad065d323"}
```

# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[1]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-a30e705f-f0ad-4f0d-9693-487e7572f167` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-9708973e-3a90-4205-afc2-077353af91a0` |
| 3 | `POST /v1/accounts` | 201 | 15 | `qa-058ff39b-ae83-4460-9861-cd462bc286a9` |
| 4 | `POST /v1/auth/token` | 200 | 9 | `qa-6b020dc7-9208-4c2c-9919-211279242f3b` |
| 5 | `POST /v1/conversations` | 201 | 6 | `qa-d0fd8587-d327-4860-8808-28a8e3227084` |
| 6 | `POST /v1/auth/token` | 200 | 12 | `qa-3a537383-5a19-46f8-aad2-472ccd6f11fd` |
| 7 | `GET /v1/conversations/{id}/messages` | 403 | 9 | `qa-3d6c0937-a43c-4b8f-bbba-b521bce0c0e7` |
| 8 | `DELETE /v1/accounts/me` | 204 | 47 | `qa-ef867198-9408-42f9-a656-19fcbcad0192` |
| 9 | `POST /v1/auth/token` | 401 | 15 | `qa-6198e955-553d-4e7e-9eb2-2399eba603cc` |
| 10 | `POST /v1/auth/token` | 200 | 41 | `qa-b1413b66-3515-4c5e-a497-c4291c4b2681` |
| 11 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-84a6e029-5bf1-4c24-ba38-6a1d79619a18` |
| 12 | `POST /v1/auth/token` | 401 | 24 | `qa-619acd9f-fcbe-4c12-84b7-affbfa1835dc` |
| 13 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-eccc65f3-e5aa-4d49-aa89-cc46890c9225` |
| 14 | `POST /v1/auth/token` | 401 | 27 | `qa-a6c052db-1179-420c-bbe5-4feaa6b7bb6f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a30e705f-f0ad-4f0d-9693-487e7572f167

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a30e705f-f0ad-4f0d-9693-487e7572f167
Content-Type: application/json

--- request body ---
{"handle":"qa-36dcfa3f85d1","displayName":"QA 36dcfa3f85d1","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-a30e705f-f0ad-4f0d-9693-487e7572f167
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
Location: /v1/accounts/qa-36dcfa3f85d1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_20492dec-b91a-4656-8d31-14e299b9f741","handle":"qa-36dcfa3f85d1","displayName":"QA 36dcfa3f85d1","region":"eu","role":"user","createdAt":"2026-11-25T11:27:57.293607387Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9708973e-3a90-4205-afc2-077353af91a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9708973e-3a90-4205-afc2-077353af91a0
Content-Type: application/json

--- request body ---
{"handle":"qa-0fbdd07dc72c","displayName":"QA 0fbdd07dc72c","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-9708973e-3a90-4205-afc2-077353af91a0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 546
RateLimit-Reset: 10
Location: /v1/accounts/qa-0fbdd07dc72c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3078a9b4-803c-4bc0-9c7c-56d90d8e9099","handle":"qa-0fbdd07dc72c","displayName":"QA 0fbdd07dc72c","region":"eu","role":"user","createdAt":"2026-11-25T11:27:57.328737924Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-058ff39b-ae83-4460-9861-cd462bc286a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-058ff39b-ae83-4460-9861-cd462bc286a9
Content-Type: application/json

--- request body ---
{"handle":"qa-e0d7e978ce44","displayName":"QA e0d7e978ce44","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-058ff39b-ae83-4460-9861-cd462bc286a9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 541
RateLimit-Reset: 10
Location: /v1/accounts/qa-e0d7e978ce44
X-Served-Region: eu
Content-Length: 181

{"id":"acc_60310bb6-5a59-46ae-812f-bf2be81ce6a5","handle":"qa-e0d7e978ce44","displayName":"QA e0d7e978ce44","region":"eu","role":"user","createdAt":"2026-11-25T11:27:57.361844677Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-6b020dc7-9208-4c2c-9919-211279242f3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b020dc7-9208-4c2c-9919-211279242f3b
Content-Type: application/json

--- request body ---
{"handle":"qa-36dcfa3f85d1","password":"****"}

--- response: 200 in 9 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b020dc7-9208-4c2c-9919-211279242f3b
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_20492dec-b91a-4656-8d31-14e299b9f741"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-d0fd8587-d327-4860-8808-28a8e3227084

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0fd8587-d327-4860-8808-28a8e3227084
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0fbdd07dc72c","subject":"Error contract","message":"Hi"}

--- response: 201 in 6 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0fd8587-d327-4860-8808-28a8e3227084
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
Location: /v1/conversations/cnv_ea333d57-1bc6-4e35-8807-6301109d8b2b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ea333d57-1bc6-4e35-8807-6301109d8b2b","subject":"Error contract","status":"open","region":"eu","participants":["qa-36dcfa3f85d1","qa-0fbdd07dc72c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:57.407977092Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3a537383-5a19-46f8-aad2-472ccd6f11fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a537383-5a19-46f8-aad2-472ccd6f11fd
Content-Type: application/json

--- request body ---
{"handle":"qa-e0d7e978ce44","password":"****"}

--- response: 200 in 12 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a537383-5a19-46f8-aad2-472ccd6f11fd
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_60310bb6-5a59-46ae-812f-bf2be81ce6a5"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_ea333d57-1bc6-4e35-8807-6301109d8b2b/messages
correlation: qa-3d6c0937-a43c-4b8f-bbba-b521bce0c0e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d6c0937-a43c-4b8f-bbba-b521bce0c0e7
Content-Type: application/json

--- response: 403 in 9 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3d6c0937-a43c-4b8f-bbba-b521bce0c0e7
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_ea333d57-1bc6-4e35-8807-6301109d8b2b/messages","correlationId":"qa-3d6c0937-a43c-4b8f-bbba-b521bce0c0e7"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ef867198-9408-42f9-a656-19fcbcad0192

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef867198-9408-42f9-a656-19fcbcad0192
Content-Type: application/json

--- response: 204 in 47 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ef867198-9408-42f9-a656-19fcbcad0192
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
correlation: qa-6198e955-553d-4e7e-9eb2-2399eba603cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6198e955-553d-4e7e-9eb2-2399eba603cc
Content-Type: application/json

--- request body ---
{"handle":"qa-e0d7e978ce44","password":"****"}

--- response: 401 in 15 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6198e955-553d-4e7e-9eb2-2399eba603cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 513
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6198e955-553d-4e7e-9eb2-2399eba603cc"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-b1413b66-3515-4c5e-a497-c4291c4b2681

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1413b66-3515-4c5e-a497-c4291c4b2681
Content-Type: application/json

--- request body ---
{"handle":"qa-0fbdd07dc72c","password":"****"}

--- response: 200 in 41 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1413b66-3515-4c5e-a497-c4291c4b2681
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 506
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3078a9b4-803c-4bc0-9c7c-56d90d8e9099"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-84a6e029-5bf1-4c24-ba38-6a1d79619a18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84a6e029-5bf1-4c24-ba38-6a1d79619a18
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-84a6e029-5bf1-4c24-ba38-6a1d79619a18
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
correlation: qa-619acd9f-fcbe-4c12-84b7-affbfa1835dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-619acd9f-fcbe-4c12-84b7-affbfa1835dc
Content-Type: application/json

--- request body ---
{"handle":"qa-0fbdd07dc72c","password":"****"}

--- response: 401 in 24 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-619acd9f-fcbe-4c12-84b7-affbfa1835dc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 492
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-619acd9f-fcbe-4c12-84b7-affbfa1835dc"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-eccc65f3-e5aa-4d49-aa89-cc46890c9225

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eccc65f3-e5aa-4d49-aa89-cc46890c9225
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-eccc65f3-e5aa-4d49-aa89-cc46890c9225
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
correlation: qa-a6c052db-1179-420c-bbe5-4feaa6b7bb6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6c052db-1179-420c-bbe5-4feaa6b7bb6f
Content-Type: application/json

--- request body ---
{"handle":"qa-36dcfa3f85d1","password":"****"}

--- response: 401 in 27 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a6c052db-1179-420c-bbe5-4feaa6b7bb6f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 480
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a6c052db-1179-420c-bbe5-4feaa6b7bb6f"}
```

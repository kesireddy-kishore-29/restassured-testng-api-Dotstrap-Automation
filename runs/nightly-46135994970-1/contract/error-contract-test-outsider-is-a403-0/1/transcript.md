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
| 1 | `POST /v1/accounts` | 201 | 45 | `qa-a10e5194-5426-46b7-bd00-e036a7acf4bc` |
| 2 | `POST /v1/accounts` | 201 | 65 | `qa-05dcd823-94fc-48d9-aca2-23cd29bcc76f` |
| 3 | `POST /v1/accounts` | 201 | 46 | `qa-88424e6a-bea6-4ca8-9f34-4ff913c94b78` |
| 4 | `POST /v1/auth/token` | 200 | 31 | `qa-e100ac94-5d04-48f6-868a-a195851c5f89` |
| 5 | `POST /v1/conversations` | 201 | 26 | `qa-6fe81a9b-146c-475c-a8c5-833a385e7cde` |
| 6 | `POST /v1/auth/token` | 200 | 36 | `qa-7ed75b55-4b64-468c-919d-ebbfd0b7d0d3` |
| 7 | `GET /v1/conversations/{id}` | 403 | 27 | `qa-bc174262-ba1c-43fc-a826-55c585568219` |
| 8 | `DELETE /v1/accounts/me` | 204 | 43 | `qa-ac0ca678-e1ab-49c0-9d59-e7ba2125d80c` |
| 9 | `POST /v1/auth/token` | 401 | 32 | `qa-7e8bb648-c2a1-4efe-9dc0-bb8e7d8b6c5d` |
| 10 | `POST /v1/auth/token` | 200 | 53 | `qa-2220dae3-63f8-484e-a2fa-708aa518761d` |
| 11 | `DELETE /v1/accounts/me` | 204 | 37 | `qa-faf89d35-a835-45fc-a8d1-7f92b060945e` |
| 12 | `POST /v1/auth/token` | 401 | 33 | `qa-6233e0cb-e939-4dc5-9d60-402a5d4c915c` |
| 13 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-075b8d61-90c4-4d76-8981-9feac773e63a` |
| 14 | `POST /v1/auth/token` | 401 | 35 | `qa-a2035f89-3f5f-421d-9d39-50d606da9fba` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a10e5194-5426-46b7-bd00-e036a7acf4bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a10e5194-5426-46b7-bd00-e036a7acf4bc
Content-Type: application/json

--- request body ---
{"handle":"qa-99303c35ed0e","displayName":"QA 99303c35ed0e","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-a10e5194-5426-46b7-bd00-e036a7acf4bc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Location: /v1/accounts/qa-99303c35ed0e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_99bd73b8-09ad-40f8-bc08-6030a536feab","handle":"qa-99303c35ed0e","displayName":"QA 99303c35ed0e","region":"eu","role":"user","createdAt":"2026-11-28T10:37:22.558558383Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-05dcd823-94fc-48d9-aca2-23cd29bcc76f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05dcd823-94fc-48d9-aca2-23cd29bcc76f
Content-Type: application/json

--- request body ---
{"handle":"qa-38ee648db3b7","displayName":"QA 38ee648db3b7","password":"****","region":"eu"}

--- response: 201 in 65 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-05dcd823-94fc-48d9-aca2-23cd29bcc76f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 9
Location: /v1/accounts/qa-38ee648db3b7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cbb99d67-be0d-469e-8d0d-d6b6e944b948","handle":"qa-38ee648db3b7","displayName":"QA 38ee648db3b7","region":"eu","role":"user","createdAt":"2026-11-28T10:37:22.657789507Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-88424e6a-bea6-4ca8-9f34-4ff913c94b78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88424e6a-bea6-4ca8-9f34-4ff913c94b78
Content-Type: application/json

--- request body ---
{"handle":"qa-15f2a4ceb215","displayName":"QA 15f2a4ceb215","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-88424e6a-bea6-4ca8-9f34-4ff913c94b78
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 545
RateLimit-Reset: 9
Location: /v1/accounts/qa-15f2a4ceb215
X-Served-Region: eu
Content-Length: 181

{"id":"acc_042f1437-9fb3-4668-87a4-552f9213108c","handle":"qa-15f2a4ceb215","displayName":"QA 15f2a4ceb215","region":"eu","role":"user","createdAt":"2026-11-28T10:37:22.741192169Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-e100ac94-5d04-48f6-868a-a195851c5f89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e100ac94-5d04-48f6-868a-a195851c5f89
Content-Type: application/json

--- request body ---
{"handle":"qa-99303c35ed0e","password":"****"}

--- response: 200 in 31 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-e100ac94-5d04-48f6-868a-a195851c5f89
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_99bd73b8-09ad-40f8-bc08-6030a536feab"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-6fe81a9b-146c-475c-a8c5-833a385e7cde

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6fe81a9b-146c-475c-a8c5-833a385e7cde
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-38ee648db3b7","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-6fe81a9b-146c-475c-a8c5-833a385e7cde
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
Location: /v1/conversations/cnv_2bc6f236-da79-4985-959b-6f3400821fa3
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2bc6f236-da79-4985-959b-6f3400821fa3","subject":"Error contract","status":"open","region":"eu","participants":["qa-99303c35ed0e","qa-38ee648db3b7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:22.828827375Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7ed75b55-4b64-468c-919d-ebbfd0b7d0d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ed75b55-4b64-468c-919d-ebbfd0b7d0d3
Content-Type: application/json

--- request body ---
{"handle":"qa-15f2a4ceb215","password":"****"}

--- response: 200 in 36 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ed75b55-4b64-468c-919d-ebbfd0b7d0d3
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_042f1437-9fb3-4668-87a4-552f9213108c"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_2bc6f236-da79-4985-959b-6f3400821fa3
correlation: qa-bc174262-ba1c-43fc-a826-55c585568219

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc174262-ba1c-43fc-a826-55c585568219
Content-Type: application/json

--- response: 403 in 27 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bc174262-ba1c-43fc-a826-55c585568219
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_2bc6f236-da79-4985-959b-6f3400821fa3","correlationId":"qa-bc174262-ba1c-43fc-a826-55c585568219"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ac0ca678-e1ab-49c0-9d59-e7ba2125d80c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac0ca678-e1ab-49c0-9d59-e7ba2125d80c
Content-Type: application/json

--- response: 204 in 43 ms ---
Date: Sat, 28 Nov 2026 10:37:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ac0ca678-e1ab-49c0-9d59-e7ba2125d80c
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
correlation: qa-7e8bb648-c2a1-4efe-9dc0-bb8e7d8b6c5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e8bb648-c2a1-4efe-9dc0-bb8e7d8b6c5d
Content-Type: application/json

--- request body ---
{"handle":"qa-15f2a4ceb215","password":"****"}

--- response: 401 in 32 ms ---
Date: Sat, 28 Nov 2026 10:37:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7e8bb648-c2a1-4efe-9dc0-bb8e7d8b6c5d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 512
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7e8bb648-c2a1-4efe-9dc0-bb8e7d8b6c5d"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-2220dae3-63f8-484e-a2fa-708aa518761d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2220dae3-63f8-484e-a2fa-708aa518761d
Content-Type: application/json

--- request body ---
{"handle":"qa-38ee648db3b7","password":"****"}

--- response: 200 in 53 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-2220dae3-63f8-484e-a2fa-708aa518761d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 503
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cbb99d67-be0d-469e-8d0d-d6b6e944b948"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-faf89d35-a835-45fc-a8d1-7f92b060945e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-faf89d35-a835-45fc-a8d1-7f92b060945e
Content-Type: application/json

--- response: 204 in 37 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-faf89d35-a835-45fc-a8d1-7f92b060945e
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
correlation: qa-6233e0cb-e939-4dc5-9d60-402a5d4c915c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6233e0cb-e939-4dc5-9d60-402a5d4c915c
Content-Type: application/json

--- request body ---
{"handle":"qa-38ee648db3b7","password":"****"}

--- response: 401 in 33 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6233e0cb-e939-4dc5-9d60-402a5d4c915c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 490
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6233e0cb-e939-4dc5-9d60-402a5d4c915c"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-075b8d61-90c4-4d76-8981-9feac773e63a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-075b8d61-90c4-4d76-8981-9feac773e63a
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-075b8d61-90c4-4d76-8981-9feac773e63a
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
correlation: qa-a2035f89-3f5f-421d-9d39-50d606da9fba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2035f89-3f5f-421d-9d39-50d606da9fba
Content-Type: application/json

--- request body ---
{"handle":"qa-99303c35ed0e","password":"****"}

--- response: 401 in 35 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a2035f89-3f5f-421d-9d39-50d606da9fba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 474
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a2035f89-3f5f-421d-9d39-50d606da9fba"}
```

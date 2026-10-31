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
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-ede60f4f-6c58-4a0b-8b71-33042029e549` |
| 2 | `POST /v1/accounts` | 201 | 37 | `qa-4b7cb70b-07bc-40b2-b634-02587401eb54` |
| 3 | `POST /v1/accounts` | 201 | 31 | `qa-e832ac4b-bd6f-4857-b2c7-c7dc67abc101` |
| 4 | `POST /v1/auth/token` | 200 | 13 | `qa-baa3917c-8a21-4e52-9c7e-4bd59df3f5c5` |
| 5 | `POST /v1/conversations` | 201 | 8 | `qa-5bfc3865-979e-4555-9f06-6512a45175ab` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-01747064-0ff6-4d84-ac63-6ccc5f3572ca` |
| 7 | `POST /v1/conversations/{id}/messages` | 403 | 11 | `qa-98fb7268-2db1-40c8-8cfd-572f27f92fb9` |
| 8 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-a19113f3-57c4-4aaa-b453-6a9295e471b6` |
| 9 | `POST /v1/auth/token` | 401 | 24 | `qa-ca130d99-9dfb-4aae-927d-a31eafe72c27` |
| 10 | `POST /v1/auth/token` | 200 | 26 | `qa-5a53965d-83f7-4a50-8b01-7332e14759ce` |
| 11 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-381f6c71-2e59-4b56-9d30-981b4c8b52e8` |
| 12 | `POST /v1/auth/token` | 401 | 17 | `qa-2ea1e38f-9dd1-4872-a43d-c0520f915942` |
| 13 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-3bdac82e-46f2-4bcd-a86d-4ea6139b44f3` |
| 14 | `POST /v1/auth/token` | 401 | 16 | `qa-eaa9239a-2ee9-45b8-9e9b-2f47dc88d1f9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ede60f4f-6c58-4a0b-8b71-33042029e549

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ede60f4f-6c58-4a0b-8b71-33042029e549
Content-Type: application/json

--- request body ---
{"handle":"qa-2e1025cc9bfd","displayName":"QA 2e1025cc9bfd","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-ede60f4f-6c58-4a0b-8b71-33042029e549
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 543
RateLimit-Reset: 9
Location: /v1/accounts/qa-2e1025cc9bfd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b7fab419-c028-41fa-868c-88ae51a34601","handle":"qa-2e1025cc9bfd","displayName":"QA 2e1025cc9bfd","region":"eu","role":"user","createdAt":"2026-10-26T07:54:46.425780624Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4b7cb70b-07bc-40b2-b634-02587401eb54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b7cb70b-07bc-40b2-b634-02587401eb54
Content-Type: application/json

--- request body ---
{"handle":"qa-1c0ec1bf8b37","displayName":"QA 1c0ec1bf8b37","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b7cb70b-07bc-40b2-b634-02587401eb54
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
Location: /v1/accounts/qa-1c0ec1bf8b37
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b4058b43-6762-4481-9f59-b3f8f0aafc5e","handle":"qa-1c0ec1bf8b37","displayName":"QA 1c0ec1bf8b37","region":"eu","role":"user","createdAt":"2026-10-26T07:54:46.483558747Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-e832ac4b-bd6f-4857-b2c7-c7dc67abc101

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e832ac4b-bd6f-4857-b2c7-c7dc67abc101
Content-Type: application/json

--- request body ---
{"handle":"qa-2e584b1ec683","displayName":"QA 2e584b1ec683","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-e832ac4b-bd6f-4857-b2c7-c7dc67abc101
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
Location: /v1/accounts/qa-2e584b1ec683
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f1f6db29-f2a5-49c5-9238-f5c355cb2980","handle":"qa-2e584b1ec683","displayName":"QA 2e584b1ec683","region":"eu","role":"user","createdAt":"2026-10-26T07:54:46.518231466Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-baa3917c-8a21-4e52-9c7e-4bd59df3f5c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-baa3917c-8a21-4e52-9c7e-4bd59df3f5c5
Content-Type: application/json

--- request body ---
{"handle":"qa-2e1025cc9bfd","password":"****"}

--- response: 200 in 13 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-baa3917c-8a21-4e52-9c7e-4bd59df3f5c5
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b7fab419-c028-41fa-868c-88ae51a34601"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-5bfc3865-979e-4555-9f06-6512a45175ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5bfc3865-979e-4555-9f06-6512a45175ab
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1c0ec1bf8b37","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-5bfc3865-979e-4555-9f06-6512a45175ab
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
Location: /v1/conversations/cnv_0a71a483-556b-4d20-ac00-75a64cc989c1
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0a71a483-556b-4d20-ac00-75a64cc989c1","subject":"Error contract","status":"open","region":"eu","participants":["qa-2e1025cc9bfd","qa-1c0ec1bf8b37"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:46.566662145Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-01747064-0ff6-4d84-ac63-6ccc5f3572ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01747064-0ff6-4d84-ac63-6ccc5f3572ca
Content-Type: application/json

--- request body ---
{"handle":"qa-2e584b1ec683","password":"****"}

--- response: 200 in 21 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-01747064-0ff6-4d84-ac63-6ccc5f3572ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 527
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f1f6db29-f2a5-49c5-9238-f5c355cb2980"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_0a71a483-556b-4d20-ac00-75a64cc989c1/messages
correlation: qa-98fb7268-2db1-40c8-8cfd-572f27f92fb9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98fb7268-2db1-40c8-8cfd-572f27f92fb9
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 403 in 11 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-98fb7268-2db1-40c8-8cfd-572f27f92fb9
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_0a71a483-556b-4d20-ac00-75a64cc989c1/messages","correlationId":"qa-98fb7268-2db1-40c8-8cfd-572f27f92fb9"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a19113f3-57c4-4aaa-b453-6a9295e471b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a19113f3-57c4-4aaa-b453-6a9295e471b6
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a19113f3-57c4-4aaa-b453-6a9295e471b6
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
correlation: qa-ca130d99-9dfb-4aae-927d-a31eafe72c27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca130d99-9dfb-4aae-927d-a31eafe72c27
Content-Type: application/json

--- request body ---
{"handle":"qa-2e584b1ec683","password":"****"}

--- response: 401 in 24 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ca130d99-9dfb-4aae-927d-a31eafe72c27
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 512
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ca130d99-9dfb-4aae-927d-a31eafe72c27"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-5a53965d-83f7-4a50-8b01-7332e14759ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a53965d-83f7-4a50-8b01-7332e14759ce
Content-Type: application/json

--- request body ---
{"handle":"qa-1c0ec1bf8b37","password":"****"}

--- response: 200 in 26 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a53965d-83f7-4a50-8b01-7332e14759ce
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b4058b43-6762-4481-9f59-b3f8f0aafc5e"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-381f6c71-2e59-4b56-9d30-981b4c8b52e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-381f6c71-2e59-4b56-9d30-981b4c8b52e8
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-381f6c71-2e59-4b56-9d30-981b4c8b52e8
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
correlation: qa-2ea1e38f-9dd1-4872-a43d-c0520f915942

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ea1e38f-9dd1-4872-a43d-c0520f915942
Content-Type: application/json

--- request body ---
{"handle":"qa-1c0ec1bf8b37","password":"****"}

--- response: 401 in 17 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2ea1e38f-9dd1-4872-a43d-c0520f915942
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2ea1e38f-9dd1-4872-a43d-c0520f915942"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3bdac82e-46f2-4bcd-a86d-4ea6139b44f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3bdac82e-46f2-4bcd-a86d-4ea6139b44f3
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3bdac82e-46f2-4bcd-a86d-4ea6139b44f3
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
correlation: qa-eaa9239a-2ee9-45b8-9e9b-2f47dc88d1f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eaa9239a-2ee9-45b8-9e9b-2f47dc88d1f9
Content-Type: application/json

--- request body ---
{"handle":"qa-2e1025cc9bfd","password":"****"}

--- response: 401 in 16 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eaa9239a-2ee9-45b8-9e9b-2f47dc88d1f9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 478
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-eaa9239a-2ee9-45b8-9e9b-2f47dc88d1f9"}
```

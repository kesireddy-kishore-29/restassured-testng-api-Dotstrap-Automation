# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[4]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 48 | `qa-a4412b53-a72c-406e-a07b-ab49519b587b` |
| 2 | `POST /v1/accounts` | 201 | 46 | `qa-da2b3467-e551-44ea-9e49-ae1df8aab406` |
| 3 | `POST /v1/accounts` | 201 | 47 | `qa-13a573aa-9b67-4355-8916-1692d0c3f765` |
| 4 | `POST /v1/auth/token` | 200 | 47 | `qa-bc2df87f-185f-4bca-b2f2-be5616aaac15` |
| 5 | `POST /v1/conversations` | 201 | 19 | `qa-65c3afd9-36d1-4043-8865-88dbb124b7dc` |
| 6 | `POST /v1/auth/token` | 200 | 35 | `qa-d6b07eb3-c996-4893-a653-9db443d12d59` |
| 7 | `POST /v1/conversations/{id}/close` | 403 | 19 | `qa-da85df41-6bd3-43e8-8951-34fcc0db7c58` |
| 8 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-cfb21256-31b3-45f2-be18-2a3e0757d41e` |
| 9 | `POST /v1/auth/token` | 401 | 25 | `qa-bc9cf4d1-762f-4df0-a8eb-07f510e0ff49` |
| 10 | `POST /v1/auth/token` | 200 | 44 | `qa-4ea352f6-7bbe-4f2e-a95e-9572fb845e49` |
| 11 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-54178c33-9512-4a8b-a2b2-908c9814b4fa` |
| 12 | `POST /v1/auth/token` | 401 | 37 | `qa-bf0ce7f1-fe7f-4b00-ab85-96bd5f9252f7` |
| 13 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-a550c28b-68e5-4e3d-a343-929d545ffaea` |
| 14 | `POST /v1/auth/token` | 401 | 20 | `qa-ba7ab8b2-1923-4987-a8c7-c30aed662365` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a4412b53-a72c-406e-a07b-ab49519b587b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4412b53-a72c-406e-a07b-ab49519b587b
Content-Type: application/json

--- request body ---
{"handle":"qa-36ba5f36d62d","displayName":"QA 36ba5f36d62d","password":"****","region":"eu"}

--- response: 201 in 48 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-a4412b53-a72c-406e-a07b-ab49519b587b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 467
RateLimit-Reset: 8
Location: /v1/accounts/qa-36ba5f36d62d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_78483b23-8c48-44cc-9d9f-ce5b79607ab1","handle":"qa-36ba5f36d62d","displayName":"QA 36ba5f36d62d","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.214688102Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-da2b3467-e551-44ea-9e49-ae1df8aab406

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da2b3467-e551-44ea-9e49-ae1df8aab406
Content-Type: application/json

--- request body ---
{"handle":"qa-4b474350834e","displayName":"QA 4b474350834e","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-da2b3467-e551-44ea-9e49-ae1df8aab406
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 455
RateLimit-Reset: 7
Location: /v1/accounts/qa-4b474350834e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_98f3abd8-792d-4d61-9c9e-c1625ac1af42","handle":"qa-4b474350834e","displayName":"QA 4b474350834e","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.296136965Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-13a573aa-9b67-4355-8916-1692d0c3f765

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13a573aa-9b67-4355-8916-1692d0c3f765
Content-Type: application/json

--- request body ---
{"handle":"qa-3d73456d1152","displayName":"QA 3d73456d1152","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-13a573aa-9b67-4355-8916-1692d0c3f765
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 448
RateLimit-Reset: 7
Location: /v1/accounts/qa-3d73456d1152
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0d357855-32dd-4525-accf-706a4166ae56","handle":"qa-3d73456d1152","displayName":"QA 3d73456d1152","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.365330669Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-bc2df87f-185f-4bca-b2f2-be5616aaac15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc2df87f-185f-4bca-b2f2-be5616aaac15
Content-Type: application/json

--- request body ---
{"handle":"qa-36ba5f36d62d","password":"****"}

--- response: 200 in 47 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc2df87f-185f-4bca-b2f2-be5616aaac15
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 443
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_78483b23-8c48-44cc-9d9f-ce5b79607ab1"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-65c3afd9-36d1-4043-8865-88dbb124b7dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65c3afd9-36d1-4043-8865-88dbb124b7dc
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4b474350834e","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-65c3afd9-36d1-4043-8865-88dbb124b7dc
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
Location: /v1/conversations/cnv_74440547-4b79-4304-b6e8-4ea195c817c3
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_74440547-4b79-4304-b6e8-4ea195c817c3","subject":"Error contract","status":"open","region":"eu","participants":["qa-36ba5f36d62d","qa-4b474350834e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:34.482418463Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d6b07eb3-c996-4893-a653-9db443d12d59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6b07eb3-c996-4893-a653-9db443d12d59
Content-Type: application/json

--- request body ---
{"handle":"qa-3d73456d1152","password":"****"}

--- response: 200 in 35 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6b07eb3-c996-4893-a653-9db443d12d59
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 440
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0d357855-32dd-4525-accf-706a4166ae56"}
```

## 7. POST /v1/conversations/{id}/close

```text
#7 POST http://localhost:7070/v1/conversations/cnv_74440547-4b79-4304-b6e8-4ea195c817c3/close
correlation: qa-da85df41-6bd3-43e8-8951-34fcc0db7c58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da85df41-6bd3-43e8-8951-34fcc0db7c58
Content-Type: application/json

--- response: 403 in 19 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-da85df41-6bd3-43e8-8951-34fcc0db7c58
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
Content-Length: 291

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_74440547-4b79-4304-b6e8-4ea195c817c3/close","correlationId":"qa-da85df41-6bd3-43e8-8951-34fcc0db7c58"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cfb21256-31b3-45f2-be18-2a3e0757d41e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfb21256-31b3-45f2-be18-2a3e0757d41e
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cfb21256-31b3-45f2-be18-2a3e0757d41e
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
correlation: qa-bc9cf4d1-762f-4df0-a8eb-07f510e0ff49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc9cf4d1-762f-4df0-a8eb-07f510e0ff49
Content-Type: application/json

--- request body ---
{"handle":"qa-3d73456d1152","password":"****"}

--- response: 401 in 25 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bc9cf4d1-762f-4df0-a8eb-07f510e0ff49
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 412
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bc9cf4d1-762f-4df0-a8eb-07f510e0ff49"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-4ea352f6-7bbe-4f2e-a95e-9572fb845e49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ea352f6-7bbe-4f2e-a95e-9572fb845e49
Content-Type: application/json

--- request body ---
{"handle":"qa-4b474350834e","password":"****"}

--- response: 200 in 44 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ea352f6-7bbe-4f2e-a95e-9572fb845e49
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 403
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_98f3abd8-792d-4d61-9c9e-c1625ac1af42"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-54178c33-9512-4a8b-a2b2-908c9814b4fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54178c33-9512-4a8b-a2b2-908c9814b4fa
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-54178c33-9512-4a8b-a2b2-908c9814b4fa
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
correlation: qa-bf0ce7f1-fe7f-4b00-ab85-96bd5f9252f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf0ce7f1-fe7f-4b00-ab85-96bd5f9252f7
Content-Type: application/json

--- request body ---
{"handle":"qa-4b474350834e","password":"****"}

--- response: 401 in 37 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bf0ce7f1-fe7f-4b00-ab85-96bd5f9252f7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 393
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bf0ce7f1-fe7f-4b00-ab85-96bd5f9252f7"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a550c28b-68e5-4e3d-a343-929d545ffaea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a550c28b-68e5-4e3d-a343-929d545ffaea
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a550c28b-68e5-4e3d-a343-929d545ffaea
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
correlation: qa-ba7ab8b2-1923-4987-a8c7-c30aed662365

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba7ab8b2-1923-4987-a8c7-c30aed662365
Content-Type: application/json

--- request body ---
{"handle":"qa-36ba5f36d62d","password":"****"}

--- response: 401 in 20 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ba7ab8b2-1923-4987-a8c7-c30aed662365
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 389
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ba7ab8b2-1923-4987-a8c7-c30aed662365"}
```

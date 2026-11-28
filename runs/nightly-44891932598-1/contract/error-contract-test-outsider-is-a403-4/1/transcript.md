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
| 1 | `POST /v1/accounts` | 201 | 61 | `qa-c1bee80f-f651-429f-9236-fce6e0575f9d` |
| 2 | `POST /v1/accounts` | 201 | 41 | `qa-a75ea859-48a3-41a4-b95a-4a0ed5c03ea4` |
| 3 | `POST /v1/accounts` | 201 | 32 | `qa-dc8b75ba-e856-4e6d-9805-6f48eb02161e` |
| 4 | `POST /v1/auth/token` | 200 | 37 | `qa-300a2ea4-740a-48ab-825c-52f52c2ebd65` |
| 5 | `POST /v1/conversations` | 201 | 16 | `qa-7ea385a5-d0a6-44f8-9be2-4c4fe3ef84f9` |
| 6 | `POST /v1/auth/token` | 200 | 51 | `qa-0bc67151-b029-4216-9abc-1659ffa2b51d` |
| 7 | `POST /v1/conversations/{id}/close` | 403 | 35 | `qa-a76876a3-c40c-4273-9c66-ae64dd2e0071` |
| 8 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-d3220fa0-60a6-4740-bf1b-4dc874e80e67` |
| 9 | `POST /v1/auth/token` | 401 | 18 | `qa-e350abf1-f3eb-4a49-82bf-c53081f7b2ec` |
| 10 | `POST /v1/auth/token` | 200 | 56 | `qa-b15f0682-57ab-4548-b679-89c551bd40ed` |
| 11 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-1b705c5c-312f-4ab1-a8d5-21f9bc8ce48a` |
| 12 | `POST /v1/auth/token` | 401 | 23 | `qa-964c9f5a-9308-4aac-8edd-5c9441048c8f` |
| 13 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-4f2694d3-24cd-4af6-bf8f-53f5fb48d642` |
| 14 | `POST /v1/auth/token` | 401 | 20 | `qa-6b511d0a-74a8-4dc3-800e-8c70baa34489` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c1bee80f-f651-429f-9236-fce6e0575f9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1bee80f-f651-429f-9236-fce6e0575f9d
Content-Type: application/json

--- request body ---
{"handle":"qa-131491205110","displayName":"QA 131491205110","password":"****","region":"eu"}

--- response: 201 in 61 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-c1bee80f-f651-429f-9236-fce6e0575f9d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 467
RateLimit-Reset: 7
Location: /v1/accounts/qa-131491205110
X-Served-Region: eu
Content-Length: 181

{"id":"acc_afd1b69d-ef54-40a5-a178-1c2f966b0201","handle":"qa-131491205110","displayName":"QA 131491205110","region":"eu","role":"user","createdAt":"2026-11-21T09:57:10.935916256Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a75ea859-48a3-41a4-b95a-4a0ed5c03ea4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a75ea859-48a3-41a4-b95a-4a0ed5c03ea4
Content-Type: application/json

--- request body ---
{"handle":"qa-cf7288b7995f","displayName":"QA cf7288b7995f","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-a75ea859-48a3-41a4-b95a-4a0ed5c03ea4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 457
RateLimit-Reset: 7
Location: /v1/accounts/qa-cf7288b7995f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b1132f05-f7d8-4f23-82ac-c13de775b1a5","handle":"qa-cf7288b7995f","displayName":"QA cf7288b7995f","region":"eu","role":"user","createdAt":"2026-11-21T09:57:10.997708882Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-dc8b75ba-e856-4e6d-9805-6f48eb02161e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc8b75ba-e856-4e6d-9805-6f48eb02161e
Content-Type: application/json

--- request body ---
{"handle":"qa-804ba3ec5cdb","displayName":"QA 804ba3ec5cdb","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc8b75ba-e856-4e6d-9805-6f48eb02161e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 450
RateLimit-Reset: 7
Location: /v1/accounts/qa-804ba3ec5cdb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7b76cd42-2595-48e8-83da-bbe42e6ec591","handle":"qa-804ba3ec5cdb","displayName":"QA 804ba3ec5cdb","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.074937068Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-300a2ea4-740a-48ab-825c-52f52c2ebd65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-300a2ea4-740a-48ab-825c-52f52c2ebd65
Content-Type: application/json

--- request body ---
{"handle":"qa-131491205110","password":"****"}

--- response: 200 in 37 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-300a2ea4-740a-48ab-825c-52f52c2ebd65
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 446
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_afd1b69d-ef54-40a5-a178-1c2f966b0201"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-7ea385a5-d0a6-44f8-9be2-4c4fe3ef84f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ea385a5-d0a6-44f8-9be2-4c4fe3ef84f9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-cf7288b7995f","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ea385a5-d0a6-44f8-9be2-4c4fe3ef84f9
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
Location: /v1/conversations/cnv_f07954e9-3a31-4b60-9560-bf2eadb79c56
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f07954e9-3a31-4b60-9560-bf2eadb79c56","subject":"Error contract","status":"open","region":"eu","participants":["qa-131491205110","qa-cf7288b7995f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:11.161843270Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0bc67151-b029-4216-9abc-1659ffa2b51d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0bc67151-b029-4216-9abc-1659ffa2b51d
Content-Type: application/json

--- request body ---
{"handle":"qa-804ba3ec5cdb","password":"****"}

--- response: 200 in 51 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-0bc67151-b029-4216-9abc-1659ffa2b51d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 439
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7b76cd42-2595-48e8-83da-bbe42e6ec591"}
```

## 7. POST /v1/conversations/{id}/close

```text
#7 POST http://localhost:7070/v1/conversations/cnv_f07954e9-3a31-4b60-9560-bf2eadb79c56/close
correlation: qa-a76876a3-c40c-4273-9c66-ae64dd2e0071

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a76876a3-c40c-4273-9c66-ae64dd2e0071
Content-Type: application/json

--- response: 403 in 35 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a76876a3-c40c-4273-9c66-ae64dd2e0071
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_f07954e9-3a31-4b60-9560-bf2eadb79c56/close","correlationId":"qa-a76876a3-c40c-4273-9c66-ae64dd2e0071"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d3220fa0-60a6-4740-bf1b-4dc874e80e67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3220fa0-60a6-4740-bf1b-4dc874e80e67
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d3220fa0-60a6-4740-bf1b-4dc874e80e67
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
correlation: qa-e350abf1-f3eb-4a49-82bf-c53081f7b2ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e350abf1-f3eb-4a49-82bf-c53081f7b2ec
Content-Type: application/json

--- request body ---
{"handle":"qa-804ba3ec5cdb","password":"****"}

--- response: 401 in 18 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e350abf1-f3eb-4a49-82bf-c53081f7b2ec
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e350abf1-f3eb-4a49-82bf-c53081f7b2ec"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-b15f0682-57ab-4548-b679-89c551bd40ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b15f0682-57ab-4548-b679-89c551bd40ed
Content-Type: application/json

--- request body ---
{"handle":"qa-cf7288b7995f","password":"****"}

--- response: 200 in 56 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-b15f0682-57ab-4548-b679-89c551bd40ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 404
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b1132f05-f7d8-4f23-82ac-c13de775b1a5"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1b705c5c-312f-4ab1-a8d5-21f9bc8ce48a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b705c5c-312f-4ab1-a8d5-21f9bc8ce48a
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1b705c5c-312f-4ab1-a8d5-21f9bc8ce48a
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
correlation: qa-964c9f5a-9308-4aac-8edd-5c9441048c8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-964c9f5a-9308-4aac-8edd-5c9441048c8f
Content-Type: application/json

--- request body ---
{"handle":"qa-cf7288b7995f","password":"****"}

--- response: 401 in 23 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-964c9f5a-9308-4aac-8edd-5c9441048c8f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 396
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-964c9f5a-9308-4aac-8edd-5c9441048c8f"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4f2694d3-24cd-4af6-bf8f-53f5fb48d642

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f2694d3-24cd-4af6-bf8f-53f5fb48d642
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4f2694d3-24cd-4af6-bf8f-53f5fb48d642
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
correlation: qa-6b511d0a-74a8-4dc3-800e-8c70baa34489

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b511d0a-74a8-4dc3-800e-8c70baa34489
Content-Type: application/json

--- request body ---
{"handle":"qa-131491205110","password":"****"}

--- response: 401 in 20 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6b511d0a-74a8-4dc3-800e-8c70baa34489
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6b511d0a-74a8-4dc3-800e-8c70baa34489"}
```

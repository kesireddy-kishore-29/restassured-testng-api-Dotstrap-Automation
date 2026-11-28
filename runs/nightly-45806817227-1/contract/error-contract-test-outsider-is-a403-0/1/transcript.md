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
| 1 | `POST /v1/accounts` | 201 | 38 | `qa-b2815d4a-8179-42b0-bb45-9f46d5b17ccf` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-9b977a59-abbf-4090-b9f8-b46dbfbe8aff` |
| 3 | `POST /v1/accounts` | 201 | 18 | `qa-1000cc75-79fc-4dfd-bd1f-ed754b43edf7` |
| 4 | `POST /v1/auth/token` | 200 | 18 | `qa-3da190ed-4651-4e05-a391-1b7d3ad59a9c` |
| 5 | `POST /v1/conversations` | 201 | 24 | `qa-d0c7724f-77d6-4e82-935e-d4f14e1f0253` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-ddcd2ea4-2028-45ea-8038-17ce660c4db5` |
| 7 | `GET /v1/conversations/{id}` | 403 | 10 | `qa-de8be669-4a04-4ae7-8385-555cfebd68b1` |
| 8 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-697667aa-c6cf-4e5e-9e6b-54ddc2b346d8` |
| 9 | `POST /v1/auth/token` | 401 | 15 | `qa-72c71502-1112-485d-882f-0a3b03d50a30` |
| 10 | `POST /v1/auth/token` | 200 | 35 | `qa-eaedec2d-0e8f-4100-8684-5bfc68de1273` |
| 11 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-6cb5b43c-2f33-4de8-b4db-a3da428b8e67` |
| 12 | `POST /v1/auth/token` | 401 | 37 | `qa-ed71cfcb-ccca-44c8-87a6-b6edcb8322a9` |
| 13 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-a7c5a780-2fb1-4204-85e8-3d18d1671e64` |
| 14 | `POST /v1/auth/token` | 401 | 44 | `qa-6ee997be-df8c-4928-a325-b882e6763808` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b2815d4a-8179-42b0-bb45-9f46d5b17ccf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2815d4a-8179-42b0-bb45-9f46d5b17ccf
Content-Type: application/json

--- request body ---
{"handle":"qa-51d98b93c5e2","displayName":"QA 51d98b93c5e2","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2815d4a-8179-42b0-bb45-9f46d5b17ccf
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
Location: /v1/accounts/qa-51d98b93c5e2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e2316d3d-e624-4b01-9429-29019ae0f4a7","handle":"qa-51d98b93c5e2","displayName":"QA 51d98b93c5e2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:43.893146288Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9b977a59-abbf-4090-b9f8-b46dbfbe8aff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b977a59-abbf-4090-b9f8-b46dbfbe8aff
Content-Type: application/json

--- request body ---
{"handle":"qa-65a1a751b8f6","displayName":"QA 65a1a751b8f6","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b977a59-abbf-4090-b9f8-b46dbfbe8aff
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
Location: /v1/accounts/qa-65a1a751b8f6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a283d0ce-fbb8-4505-85f5-fd6aab69f8c7","handle":"qa-65a1a751b8f6","displayName":"QA 65a1a751b8f6","region":"eu","role":"user","createdAt":"2026-11-26T11:02:43.947135380Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-1000cc75-79fc-4dfd-bd1f-ed754b43edf7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1000cc75-79fc-4dfd-bd1f-ed754b43edf7
Content-Type: application/json

--- request body ---
{"handle":"qa-c80bc6ffb8aa","displayName":"QA c80bc6ffb8aa","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-1000cc75-79fc-4dfd-bd1f-ed754b43edf7
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
Location: /v1/accounts/qa-c80bc6ffb8aa
X-Served-Region: eu
Content-Length: 181

{"id":"acc_82084bc8-68c0-4af0-b814-fb42eb743fb3","handle":"qa-c80bc6ffb8aa","displayName":"QA c80bc6ffb8aa","region":"eu","role":"user","createdAt":"2026-11-26T11:02:43.982671930Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-3da190ed-4651-4e05-a391-1b7d3ad59a9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3da190ed-4651-4e05-a391-1b7d3ad59a9c
Content-Type: application/json

--- request body ---
{"handle":"qa-51d98b93c5e2","password":"****"}

--- response: 200 in 18 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-3da190ed-4651-4e05-a391-1b7d3ad59a9c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e2316d3d-e624-4b01-9429-29019ae0f4a7"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-d0c7724f-77d6-4e82-935e-d4f14e1f0253

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0c7724f-77d6-4e82-935e-d4f14e1f0253
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-65a1a751b8f6","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0c7724f-77d6-4e82-935e-d4f14e1f0253
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
Location: /v1/conversations/cnv_f4da4a2a-2a02-48c8-b028-f3881016deb9
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f4da4a2a-2a02-48c8-b028-f3881016deb9","subject":"Error contract","status":"open","region":"eu","participants":["qa-51d98b93c5e2","qa-65a1a751b8f6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:44.047446724Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ddcd2ea4-2028-45ea-8038-17ce660c4db5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddcd2ea4-2028-45ea-8038-17ce660c4db5
Content-Type: application/json

--- request body ---
{"handle":"qa-c80bc6ffb8aa","password":"****"}

--- response: 200 in 23 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-ddcd2ea4-2028-45ea-8038-17ce660c4db5
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_82084bc8-68c0-4af0-b814-fb42eb743fb3"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_f4da4a2a-2a02-48c8-b028-f3881016deb9
correlation: qa-de8be669-4a04-4ae7-8385-555cfebd68b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de8be669-4a04-4ae7-8385-555cfebd68b1
Content-Type: application/json

--- response: 403 in 10 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-de8be669-4a04-4ae7-8385-555cfebd68b1
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_f4da4a2a-2a02-48c8-b028-f3881016deb9","correlationId":"qa-de8be669-4a04-4ae7-8385-555cfebd68b1"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-697667aa-c6cf-4e5e-9e6b-54ddc2b346d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-697667aa-c6cf-4e5e-9e6b-54ddc2b346d8
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: text/plain
X-Correlation-Id: qa-697667aa-c6cf-4e5e-9e6b-54ddc2b346d8
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
correlation: qa-72c71502-1112-485d-882f-0a3b03d50a30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72c71502-1112-485d-882f-0a3b03d50a30
Content-Type: application/json

--- request body ---
{"handle":"qa-c80bc6ffb8aa","password":"****"}

--- response: 401 in 15 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-72c71502-1112-485d-882f-0a3b03d50a30
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 517
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-72c71502-1112-485d-882f-0a3b03d50a30"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-eaedec2d-0e8f-4100-8684-5bfc68de1273

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eaedec2d-0e8f-4100-8684-5bfc68de1273
Content-Type: application/json

--- request body ---
{"handle":"qa-65a1a751b8f6","password":"****"}

--- response: 200 in 35 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-eaedec2d-0e8f-4100-8684-5bfc68de1273
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 511
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a283d0ce-fbb8-4505-85f5-fd6aab69f8c7"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6cb5b43c-2f33-4de8-b4db-a3da428b8e67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6cb5b43c-2f33-4de8-b4db-a3da428b8e67
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6cb5b43c-2f33-4de8-b4db-a3da428b8e67
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
correlation: qa-ed71cfcb-ccca-44c8-87a6-b6edcb8322a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed71cfcb-ccca-44c8-87a6-b6edcb8322a9
Content-Type: application/json

--- request body ---
{"handle":"qa-65a1a751b8f6","password":"****"}

--- response: 401 in 37 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ed71cfcb-ccca-44c8-87a6-b6edcb8322a9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 498
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ed71cfcb-ccca-44c8-87a6-b6edcb8322a9"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a7c5a780-2fb1-4204-85e8-3d18d1671e64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7c5a780-2fb1-4204-85e8-3d18d1671e64
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a7c5a780-2fb1-4204-85e8-3d18d1671e64
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
correlation: qa-6ee997be-df8c-4928-a325-b882e6763808

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ee997be-df8c-4928-a325-b882e6763808
Content-Type: application/json

--- request body ---
{"handle":"qa-51d98b93c5e2","password":"****"}

--- response: 401 in 44 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6ee997be-df8c-4928-a325-b882e6763808
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6ee997be-df8c-4928-a325-b882e6763808"}
```

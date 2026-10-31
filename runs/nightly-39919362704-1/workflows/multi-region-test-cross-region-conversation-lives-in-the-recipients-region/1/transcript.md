# Transcript: A cross-region conversation is stored in the recipient's region, for both sides

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiRegionTest#crossRegionConversationLivesInTheRecipientsRegion` |
| Features | FEAT-REGION-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 385 | `qa-49171f77-609f-420c-9bb4-a998ead496d8` |
| 2 | `POST /v1/accounts` | 201 | 113 | `qa-16f1108e-8c76-4e1f-a4b2-9c767b949a37` |
| 3 | `POST /v1/auth/token` | 200 | 38 | `qa-1aa0f979-bcc1-442a-b028-c12a234de3cb` |
| 4 | `POST /v1/conversations` | 201 | 89 | `qa-e660ac0c-74e2-4ffe-9a1d-55f60f1f556b` |
| 5 | `GET /v1/conversations/{id}` | 200 | 54 | `qa-c8bf6e1d-4c59-4472-8e1d-c21e56c8223c` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-6bb3fc51-cf26-4815-b5d3-f39547d0ecc7` |
| 7 | `GET /v1/conversations/{id}` | 200 | 17 | `qa-176fa795-0560-458f-9aac-a4f71e378487` |
| 8 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-a168b157-01b3-4935-ae47-17f0a78e468c` |
| 9 | `POST /v1/auth/token` | 401 | 13 | `qa-97fa83b4-7bf0-4710-a01c-920e98cd44e0` |
| 10 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-7de57385-ac75-4ab9-b3d2-6d65d6376878` |
| 11 | `POST /v1/auth/token` | 401 | 18 | `qa-f4c23b69-6d40-4cbc-8a8c-c2f815ac1de1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-49171f77-609f-420c-9bb4-a998ead496d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49171f77-609f-420c-9bb4-a998ead496d8
Content-Type: application/json

--- request body ---
{"handle":"qa-3e930b7b4855","displayName":"QA 3e930b7b4855","password":"****","region":"in"}

--- response: 201 in 385 ms ---
Date: Fri, 23 Oct 2026 07:41:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-49171f77-609f-420c-9bb4-a998ead496d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-3e930b7b4855
X-Served-Region: in
Content-Length: 181

{"id":"acc_39fe0968-3326-40f5-b5af-7de06d1e56a4","handle":"qa-3e930b7b4855","displayName":"QA 3e930b7b4855","region":"in","role":"user","createdAt":"2026-10-23T07:41:44.583855310Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-16f1108e-8c76-4e1f-a4b2-9c767b949a37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16f1108e-8c76-4e1f-a4b2-9c767b949a37
Content-Type: application/json

--- request body ---
{"handle":"qa-f025e1d31b82","displayName":"QA f025e1d31b82","password":"****","region":"eu"}

--- response: 201 in 113 ms ---
Date: Fri, 23 Oct 2026 07:41:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-16f1108e-8c76-4e1f-a4b2-9c767b949a37
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Location: /v1/accounts/qa-f025e1d31b82
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a65a25b8-5d10-4cf7-bfe1-506fb112d1d7","handle":"qa-f025e1d31b82","displayName":"QA f025e1d31b82","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.028353200Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1aa0f979-bcc1-442a-b028-c12a234de3cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1aa0f979-bcc1-442a-b028-c12a234de3cb
Content-Type: application/json

--- request body ---
{"handle":"qa-3e930b7b4855","password":"****"}

--- response: 200 in 38 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-1aa0f979-bcc1-442a-b028-c12a234de3cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_39fe0968-3326-40f5-b5af-7de06d1e56a4"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e660ac0c-74e2-4ffe-9a1d-55f60f1f556b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e660ac0c-74e2-4ffe-9a1d-55f60f1f556b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f025e1d31b82","subject":"Across regions","message":"Namaste"}

--- response: 201 in 89 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-e660ac0c-74e2-4ffe-9a1d-55f60f1f556b
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
X-Served-Region: in
Location: /v1/conversations/cnv_6160069d-c846-4c48-8cfd-ff729b04224d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6160069d-c846-4c48-8cfd-ff729b04224d","subject":"Across regions","status":"open","region":"eu","participants":["qa-3e930b7b4855","qa-f025e1d31b82"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:45.237906161Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_6160069d-c846-4c48-8cfd-ff729b04224d
correlation: qa-c8bf6e1d-4c59-4472-8e1d-c21e56c8223c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8bf6e1d-4c59-4472-8e1d-c21e56c8223c
Content-Type: application/json

--- response: 200 in 54 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8bf6e1d-4c59-4472-8e1d-c21e56c8223c
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
X-Served-Region: in
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6160069d-c846-4c48-8cfd-ff729b04224d","subject":"Across regions","status":"open","region":"eu","participants":["qa-3e930b7b4855","qa-f025e1d31b82"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:45.237906161Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6bb3fc51-cf26-4815-b5d3-f39547d0ecc7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6bb3fc51-cf26-4815-b5d3-f39547d0ecc7
Content-Type: application/json

--- request body ---
{"handle":"qa-f025e1d31b82","password":"****"}

--- response: 200 in 27 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-6bb3fc51-cf26-4815-b5d3-f39547d0ecc7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a65a25b8-5d10-4cf7-bfe1-506fb112d1d7"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_6160069d-c846-4c48-8cfd-ff729b04224d
correlation: qa-176fa795-0560-458f-9aac-a4f71e378487

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-176fa795-0560-458f-9aac-a4f71e378487
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-176fa795-0560-458f-9aac-a4f71e378487
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
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6160069d-c846-4c48-8cfd-ff729b04224d","subject":"Across regions","status":"open","region":"eu","participants":["qa-3e930b7b4855","qa-f025e1d31b82"],"messageCount":1,"unreadCount":1,"createdAt":"2026-10-23T07:41:45.237906161Z"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a168b157-01b3-4935-ae47-17f0a78e468c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a168b157-01b3-4935-ae47-17f0a78e468c
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a168b157-01b3-4935-ae47-17f0a78e468c
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
correlation: qa-97fa83b4-7bf0-4710-a01c-920e98cd44e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97fa83b4-7bf0-4710-a01c-920e98cd44e0
Content-Type: application/json

--- request body ---
{"handle":"qa-f025e1d31b82","password":"****"}

--- response: 401 in 13 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-97fa83b4-7bf0-4710-a01c-920e98cd44e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-97fa83b4-7bf0-4710-a01c-920e98cd44e0"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7de57385-ac75-4ab9-b3d2-6d65d6376878

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7de57385-ac75-4ab9-b3d2-6d65d6376878
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7de57385-ac75-4ab9-b3d2-6d65d6376878
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: in
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-f4c23b69-6d40-4cbc-8a8c-c2f815ac1de1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4c23b69-6d40-4cbc-8a8c-c2f815ac1de1
Content-Type: application/json

--- request body ---
{"handle":"qa-3e930b7b4855","password":"****"}

--- response: 401 in 18 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f4c23b69-6d40-4cbc-8a8c-c2f815ac1de1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f4c23b69-6d40-4cbc-8a8c-c2f815ac1de1"}
```

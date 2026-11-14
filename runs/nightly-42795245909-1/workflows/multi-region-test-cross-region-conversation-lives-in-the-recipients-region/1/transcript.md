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
| 1 | `POST /v1/accounts` | 201 | 322 | `qa-90751576-ec8c-43b4-80b3-e7d4651f69c4` |
| 2 | `POST /v1/accounts` | 201 | 44 | `qa-64c945c9-7d34-4723-a719-f79ff69bea2d` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-8c520165-e8e7-4322-9b34-341b55e7f374` |
| 4 | `POST /v1/conversations` | 201 | 57 | `qa-503caf61-ea12-43a3-92e7-16d1ddf49ef5` |
| 5 | `GET /v1/conversations/{id}` | 200 | 20 | `qa-f362a065-5c37-40ba-88a7-6cb9c4c70045` |
| 6 | `POST /v1/auth/token` | 200 | 8 | `qa-884e5d2b-7303-4101-9d21-014d2c51c406` |
| 7 | `GET /v1/conversations/{id}` | 200 | 5 | `qa-abfd027b-3251-4455-b78a-520b07cd10df` |
| 8 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-c1449af9-463a-48d3-a98b-b09ba8b03d20` |
| 9 | `POST /v1/auth/token` | 401 | 18 | `qa-42a5a166-a5ab-4bdd-a03f-7bb9c150ef0a` |
| 10 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-0b455d37-8ff2-43e4-9ed7-6ef987eb6cdf` |
| 11 | `POST /v1/auth/token` | 401 | 8 | `qa-e3e57c3a-8342-470f-a28a-39d1fbe6517d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-90751576-ec8c-43b4-80b3-e7d4651f69c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90751576-ec8c-43b4-80b3-e7d4651f69c4
Content-Type: application/json

--- request body ---
{"handle":"qa-d26aa176eb41","displayName":"QA d26aa176eb41","password":"****","region":"in"}

--- response: 201 in 322 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-90751576-ec8c-43b4-80b3-e7d4651f69c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-d26aa176eb41
X-Served-Region: in
Content-Length: 181

{"id":"acc_2aa39e4b-8673-4b59-8e21-94c7fab2ee9e","handle":"qa-d26aa176eb41","displayName":"QA d26aa176eb41","region":"in","role":"user","createdAt":"2026-11-10T09:59:33.404901433Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-64c945c9-7d34-4723-a719-f79ff69bea2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64c945c9-7d34-4723-a719-f79ff69bea2d
Content-Type: application/json

--- request body ---
{"handle":"qa-1c41c36215d5","displayName":"QA 1c41c36215d5","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-64c945c9-7d34-4723-a719-f79ff69bea2d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Location: /v1/accounts/qa-1c41c36215d5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_46fc371c-7898-4c3d-a558-b302645f8145","handle":"qa-1c41c36215d5","displayName":"QA 1c41c36215d5","region":"eu","role":"user","createdAt":"2026-11-10T09:59:33.710747206Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8c520165-e8e7-4322-9b34-341b55e7f374

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c520165-e8e7-4322-9b34-341b55e7f374
Content-Type: application/json

--- request body ---
{"handle":"qa-d26aa176eb41","password":"****"}

--- response: 200 in 26 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c520165-e8e7-4322-9b34-341b55e7f374
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2aa39e4b-8673-4b59-8e21-94c7fab2ee9e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-503caf61-ea12-43a3-92e7-16d1ddf49ef5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-503caf61-ea12-43a3-92e7-16d1ddf49ef5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1c41c36215d5","subject":"Across regions","message":"Namaste"}

--- response: 201 in 57 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-503caf61-ea12-43a3-92e7-16d1ddf49ef5
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
Location: /v1/conversations/cnv_40fb4927-827e-489e-8b88-d136aeb58504
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_40fb4927-827e-489e-8b88-d136aeb58504","subject":"Across regions","status":"open","region":"eu","participants":["qa-d26aa176eb41","qa-1c41c36215d5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:33.830783135Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_40fb4927-827e-489e-8b88-d136aeb58504
correlation: qa-f362a065-5c37-40ba-88a7-6cb9c4c70045

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f362a065-5c37-40ba-88a7-6cb9c4c70045
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-f362a065-5c37-40ba-88a7-6cb9c4c70045
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

{"id":"cnv_40fb4927-827e-489e-8b88-d136aeb58504","subject":"Across regions","status":"open","region":"eu","participants":["qa-d26aa176eb41","qa-1c41c36215d5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:33.830783135Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-884e5d2b-7303-4101-9d21-014d2c51c406

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-884e5d2b-7303-4101-9d21-014d2c51c406
Content-Type: application/json

--- request body ---
{"handle":"qa-1c41c36215d5","password":"****"}

--- response: 200 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-884e5d2b-7303-4101-9d21-014d2c51c406
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_46fc371c-7898-4c3d-a558-b302645f8145"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_40fb4927-827e-489e-8b88-d136aeb58504
correlation: qa-abfd027b-3251-4455-b78a-520b07cd10df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-abfd027b-3251-4455-b78a-520b07cd10df
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-abfd027b-3251-4455-b78a-520b07cd10df
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

{"id":"cnv_40fb4927-827e-489e-8b88-d136aeb58504","subject":"Across regions","status":"open","region":"eu","participants":["qa-d26aa176eb41","qa-1c41c36215d5"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-10T09:59:33.830783135Z"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c1449af9-463a-48d3-a98b-b09ba8b03d20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1449af9-463a-48d3-a98b-b09ba8b03d20
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c1449af9-463a-48d3-a98b-b09ba8b03d20
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
correlation: qa-42a5a166-a5ab-4bdd-a03f-7bb9c150ef0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42a5a166-a5ab-4bdd-a03f-7bb9c150ef0a
Content-Type: application/json

--- request body ---
{"handle":"qa-1c41c36215d5","password":"****"}

--- response: 401 in 18 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-42a5a166-a5ab-4bdd-a03f-7bb9c150ef0a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-42a5a166-a5ab-4bdd-a03f-7bb9c150ef0a"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0b455d37-8ff2-43e4-9ed7-6ef987eb6cdf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b455d37-8ff2-43e4-9ed7-6ef987eb6cdf
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0b455d37-8ff2-43e4-9ed7-6ef987eb6cdf
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
correlation: qa-e3e57c3a-8342-470f-a28a-39d1fbe6517d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3e57c3a-8342-470f-a28a-39d1fbe6517d
Content-Type: application/json

--- request body ---
{"handle":"qa-d26aa176eb41","password":"****"}

--- response: 401 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e3e57c3a-8342-470f-a28a-39d1fbe6517d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e3e57c3a-8342-470f-a28a-39d1fbe6517d"}
```

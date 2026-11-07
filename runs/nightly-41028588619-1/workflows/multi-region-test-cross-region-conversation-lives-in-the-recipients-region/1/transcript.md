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
| 1 | `POST /v1/accounts` | 201 | 530 | `qa-1c03cb83-16d2-4203-947a-9a6bf7d27436` |
| 2 | `POST /v1/accounts` | 201 | 77 | `qa-52a3f4b7-01c1-42c4-a30a-28c1b50b839b` |
| 3 | `POST /v1/auth/token` | 200 | 51 | `qa-c1e3864e-20d9-4065-9c5b-ed90a00b92ff` |
| 4 | `POST /v1/conversations` | 201 | 71 | `qa-a87c71bd-5854-45da-b586-db243fbd91bc` |
| 5 | `GET /v1/conversations/{id}` | 200 | 56 | `qa-82ee91b0-6199-46bd-b731-6f8cc0dfcf48` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-0f3f8977-2fe0-4de3-b434-7cc6f8b362ff` |
| 7 | `GET /v1/conversations/{id}` | 200 | 10 | `qa-f7679f70-8da3-4572-8ddc-186ce124a45e` |
| 8 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-d2a2a07e-e02c-4749-9eda-65386668abd2` |
| 9 | `POST /v1/auth/token` | 401 | 12 | `qa-bed6b2b8-e126-4179-9dd1-bc888631940b` |
| 10 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-f8db44bb-bdff-4109-846a-9ce570d1032a` |
| 11 | `POST /v1/auth/token` | 401 | 16 | `qa-5e656272-3697-4201-9f6f-1d923c92884e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1c03cb83-16d2-4203-947a-9a6bf7d27436

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c03cb83-16d2-4203-947a-9a6bf7d27436
Content-Type: application/json

--- request body ---
{"handle":"qa-96dd8c08c69e","displayName":"QA 96dd8c08c69e","password":"****","region":"in"}

--- response: 201 in 530 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c03cb83-16d2-4203-947a-9a6bf7d27436
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-96dd8c08c69e
X-Served-Region: in
Content-Length: 181

{"id":"acc_c41b5df1-4774-487a-973c-fbb9e77363fe","handle":"qa-96dd8c08c69e","displayName":"QA 96dd8c08c69e","region":"in","role":"user","createdAt":"2026-10-30T08:46:02.652149123Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-52a3f4b7-01c1-42c4-a30a-28c1b50b839b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52a3f4b7-01c1-42c4-a30a-28c1b50b839b
Content-Type: application/json

--- request body ---
{"handle":"qa-8ebb94d48bf4","displayName":"QA 8ebb94d48bf4","password":"****","region":"eu"}

--- response: 201 in 77 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-52a3f4b7-01c1-42c4-a30a-28c1b50b839b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Location: /v1/accounts/qa-8ebb94d48bf4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_eb507360-32ae-4897-b245-9b2dadd31fb4","handle":"qa-8ebb94d48bf4","displayName":"QA 8ebb94d48bf4","region":"eu","role":"user","createdAt":"2026-10-30T08:46:03.159502992Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c1e3864e-20d9-4065-9c5b-ed90a00b92ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1e3864e-20d9-4065-9c5b-ed90a00b92ff
Content-Type: application/json

--- request body ---
{"handle":"qa-96dd8c08c69e","password":"****"}

--- response: 200 in 51 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-c1e3864e-20d9-4065-9c5b-ed90a00b92ff
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c41b5df1-4774-487a-973c-fbb9e77363fe"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a87c71bd-5854-45da-b586-db243fbd91bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a87c71bd-5854-45da-b586-db243fbd91bc
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8ebb94d48bf4","subject":"Across regions","message":"Namaste"}

--- response: 201 in 71 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-a87c71bd-5854-45da-b586-db243fbd91bc
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
Location: /v1/conversations/cnv_d74f7116-5ec5-4829-9ca1-8b5bf1103db0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d74f7116-5ec5-4829-9ca1-8b5bf1103db0","subject":"Across regions","status":"open","region":"eu","participants":["qa-96dd8c08c69e","qa-8ebb94d48bf4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:03.357415275Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_d74f7116-5ec5-4829-9ca1-8b5bf1103db0
correlation: qa-82ee91b0-6199-46bd-b731-6f8cc0dfcf48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82ee91b0-6199-46bd-b731-6f8cc0dfcf48
Content-Type: application/json

--- response: 200 in 56 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-82ee91b0-6199-46bd-b731-6f8cc0dfcf48
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

{"id":"cnv_d74f7116-5ec5-4829-9ca1-8b5bf1103db0","subject":"Across regions","status":"open","region":"eu","participants":["qa-96dd8c08c69e","qa-8ebb94d48bf4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:03.357415275Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0f3f8977-2fe0-4de3-b434-7cc6f8b362ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f3f8977-2fe0-4de3-b434-7cc6f8b362ff
Content-Type: application/json

--- request body ---
{"handle":"qa-8ebb94d48bf4","password":"****"}

--- response: 200 in 27 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f3f8977-2fe0-4de3-b434-7cc6f8b362ff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_eb507360-32ae-4897-b245-9b2dadd31fb4"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_d74f7116-5ec5-4829-9ca1-8b5bf1103db0
correlation: qa-f7679f70-8da3-4572-8ddc-186ce124a45e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7679f70-8da3-4572-8ddc-186ce124a45e
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7679f70-8da3-4572-8ddc-186ce124a45e
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

{"id":"cnv_d74f7116-5ec5-4829-9ca1-8b5bf1103db0","subject":"Across regions","status":"open","region":"eu","participants":["qa-96dd8c08c69e","qa-8ebb94d48bf4"],"messageCount":1,"unreadCount":1,"createdAt":"2026-10-30T08:46:03.357415275Z"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d2a2a07e-e02c-4749-9eda-65386668abd2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2a2a07e-e02c-4749-9eda-65386668abd2
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d2a2a07e-e02c-4749-9eda-65386668abd2
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
correlation: qa-bed6b2b8-e126-4179-9dd1-bc888631940b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bed6b2b8-e126-4179-9dd1-bc888631940b
Content-Type: application/json

--- request body ---
{"handle":"qa-8ebb94d48bf4","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bed6b2b8-e126-4179-9dd1-bc888631940b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bed6b2b8-e126-4179-9dd1-bc888631940b"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f8db44bb-bdff-4109-846a-9ce570d1032a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8db44bb-bdff-4109-846a-9ce570d1032a
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f8db44bb-bdff-4109-846a-9ce570d1032a
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
correlation: qa-5e656272-3697-4201-9f6f-1d923c92884e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e656272-3697-4201-9f6f-1d923c92884e
Content-Type: application/json

--- request body ---
{"handle":"qa-96dd8c08c69e","password":"****"}

--- response: 401 in 16 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5e656272-3697-4201-9f6f-1d923c92884e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5e656272-3697-4201-9f6f-1d923c92884e"}
```

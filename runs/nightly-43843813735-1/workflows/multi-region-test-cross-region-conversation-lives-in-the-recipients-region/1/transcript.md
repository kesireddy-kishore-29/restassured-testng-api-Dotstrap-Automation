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
| 1 | `POST /v1/accounts` | 201 | 398 | `qa-0472c7f6-283b-4ba5-a469-6614646796ac` |
| 2 | `POST /v1/accounts` | 201 | 67 | `qa-20a6ae06-c2e8-4fd4-ad17-5c794ea43f6a` |
| 3 | `POST /v1/auth/token` | 200 | 52 | `qa-7b2e3a21-4828-468c-a745-f471a1b135b2` |
| 4 | `POST /v1/conversations` | 201 | 119 | `qa-f901138d-7315-45d3-8048-5d0dea6ee7fd` |
| 5 | `GET /v1/conversations/{id}` | 200 | 46 | `qa-172973d3-5763-448b-a4a6-b61badffe7ce` |
| 6 | `POST /v1/auth/token` | 200 | 31 | `qa-f3a9fc45-37a0-410d-97d0-0d31ad63907c` |
| 7 | `GET /v1/conversations/{id}` | 200 | 14 | `qa-8caa6589-e39b-48e9-9304-a974491100a2` |
| 8 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-06040618-93ac-4a5a-9fa4-57c20ac59632` |
| 9 | `POST /v1/auth/token` | 401 | 31 | `qa-3a37c231-6765-4f04-b7e4-b500dba129bf` |
| 10 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-b4778513-bb17-4717-919a-6fdb6515a0c8` |
| 11 | `POST /v1/auth/token` | 401 | 21 | `qa-40be5169-119a-4a3b-bd1e-d30774aecf3e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0472c7f6-283b-4ba5-a469-6614646796ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0472c7f6-283b-4ba5-a469-6614646796ac
Content-Type: application/json

--- request body ---
{"handle":"qa-f3b606ebe476","displayName":"QA f3b606ebe476","password":"****","region":"in"}

--- response: 201 in 398 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-0472c7f6-283b-4ba5-a469-6614646796ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-f3b606ebe476
X-Served-Region: in
Content-Length: 181

{"id":"acc_812145f0-8323-40fb-84b3-76fe875eb78a","handle":"qa-f3b606ebe476","displayName":"QA f3b606ebe476","region":"in","role":"user","createdAt":"2026-11-16T09:53:53.964872501Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-20a6ae06-c2e8-4fd4-ad17-5c794ea43f6a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20a6ae06-c2e8-4fd4-ad17-5c794ea43f6a
Content-Type: application/json

--- request body ---
{"handle":"qa-c5d14551042e","displayName":"QA c5d14551042e","password":"****","region":"eu"}

--- response: 201 in 67 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-20a6ae06-c2e8-4fd4-ad17-5c794ea43f6a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Location: /v1/accounts/qa-c5d14551042e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5578b59f-3288-4dcb-9a1a-e34157f64dfe","handle":"qa-c5d14551042e","displayName":"QA c5d14551042e","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.413014511Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7b2e3a21-4828-468c-a745-f471a1b135b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b2e3a21-4828-468c-a745-f471a1b135b2
Content-Type: application/json

--- request body ---
{"handle":"qa-f3b606ebe476","password":"****"}

--- response: 200 in 52 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-7b2e3a21-4828-468c-a745-f471a1b135b2
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_812145f0-8323-40fb-84b3-76fe875eb78a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f901138d-7315-45d3-8048-5d0dea6ee7fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f901138d-7315-45d3-8048-5d0dea6ee7fd
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c5d14551042e","subject":"Across regions","message":"Namaste"}

--- response: 201 in 119 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-f901138d-7315-45d3-8048-5d0dea6ee7fd
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
Location: /v1/conversations/cnv_42317bc5-12f1-4cb1-a222-d7dd151d487d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_42317bc5-12f1-4cb1-a222-d7dd151d487d","subject":"Across regions","status":"open","region":"eu","participants":["qa-f3b606ebe476","qa-c5d14551042e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:54.660848256Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_42317bc5-12f1-4cb1-a222-d7dd151d487d
correlation: qa-172973d3-5763-448b-a4a6-b61badffe7ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-172973d3-5763-448b-a4a6-b61badffe7ce
Content-Type: application/json

--- response: 200 in 46 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-172973d3-5763-448b-a4a6-b61badffe7ce
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

{"id":"cnv_42317bc5-12f1-4cb1-a222-d7dd151d487d","subject":"Across regions","status":"open","region":"eu","participants":["qa-f3b606ebe476","qa-c5d14551042e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:54.660848256Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f3a9fc45-37a0-410d-97d0-0d31ad63907c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3a9fc45-37a0-410d-97d0-0d31ad63907c
Content-Type: application/json

--- request body ---
{"handle":"qa-c5d14551042e","password":"****"}

--- response: 200 in 31 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-f3a9fc45-37a0-410d-97d0-0d31ad63907c
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5578b59f-3288-4dcb-9a1a-e34157f64dfe"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_42317bc5-12f1-4cb1-a222-d7dd151d487d
correlation: qa-8caa6589-e39b-48e9-9304-a974491100a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8caa6589-e39b-48e9-9304-a974491100a2
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-8caa6589-e39b-48e9-9304-a974491100a2
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

{"id":"cnv_42317bc5-12f1-4cb1-a222-d7dd151d487d","subject":"Across regions","status":"open","region":"eu","participants":["qa-f3b606ebe476","qa-c5d14551042e"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-16T09:53:54.660848256Z"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-06040618-93ac-4a5a-9fa4-57c20ac59632

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06040618-93ac-4a5a-9fa4-57c20ac59632
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-06040618-93ac-4a5a-9fa4-57c20ac59632
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
correlation: qa-3a37c231-6765-4f04-b7e4-b500dba129bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a37c231-6765-4f04-b7e4-b500dba129bf
Content-Type: application/json

--- request body ---
{"handle":"qa-c5d14551042e","password":"****"}

--- response: 401 in 31 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3a37c231-6765-4f04-b7e4-b500dba129bf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3a37c231-6765-4f04-b7e4-b500dba129bf"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b4778513-bb17-4717-919a-6fdb6515a0c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4778513-bb17-4717-919a-6fdb6515a0c8
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b4778513-bb17-4717-919a-6fdb6515a0c8
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
correlation: qa-40be5169-119a-4a3b-bd1e-d30774aecf3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40be5169-119a-4a3b-bd1e-d30774aecf3e
Content-Type: application/json

--- request body ---
{"handle":"qa-f3b606ebe476","password":"****"}

--- response: 401 in 21 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-40be5169-119a-4a3b-bd1e-d30774aecf3e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-40be5169-119a-4a3b-bd1e-d30774aecf3e"}
```

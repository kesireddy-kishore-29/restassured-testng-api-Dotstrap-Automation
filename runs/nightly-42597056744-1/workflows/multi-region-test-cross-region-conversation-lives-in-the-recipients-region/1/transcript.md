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
| 1 | `POST /v1/accounts` | 201 | 399 | `qa-65aae7db-289e-4f58-b61c-3d4e5989e043` |
| 2 | `POST /v1/accounts` | 201 | 80 | `qa-f44d48c2-4151-4506-8879-78afaaa7fc88` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-5c26a228-ba33-43a9-bd9d-8475ed6f1108` |
| 4 | `POST /v1/conversations` | 201 | 87 | `qa-8f61ea65-2259-4234-b7ed-e34f12efd1dd` |
| 5 | `GET /v1/conversations/{id}` | 200 | 23 | `qa-a817432d-a455-4695-b68e-145460f0c4b8` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-25f95e3b-db39-47c5-b443-5614e525d42c` |
| 7 | `GET /v1/conversations/{id}` | 200 | 15 | `qa-e7a82142-1458-472e-862e-ba78310e6f9f` |
| 8 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-b4c1f9df-6946-45b3-8796-14f293a8462c` |
| 9 | `POST /v1/auth/token` | 401 | 30 | `qa-60fb0428-e262-4e56-82fa-941978d718d4` |
| 10 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-70dfd5e6-8ce6-4f8f-91d7-69da525d9040` |
| 11 | `POST /v1/auth/token` | 401 | 9 | `qa-51ae1b0e-4f7b-4721-9966-5fe16954767d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-65aae7db-289e-4f58-b61c-3d4e5989e043

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65aae7db-289e-4f58-b61c-3d4e5989e043
Content-Type: application/json

--- request body ---
{"handle":"qa-fad52ea2225c","displayName":"QA fad52ea2225c","password":"****","region":"in"}

--- response: 201 in 399 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-65aae7db-289e-4f58-b61c-3d4e5989e043
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
Location: /v1/accounts/qa-fad52ea2225c
X-Served-Region: in
Content-Length: 181

{"id":"acc_488c8dd7-8690-4959-8770-cc85e5e6078a","handle":"qa-fad52ea2225c","displayName":"QA fad52ea2225c","region":"in","role":"user","createdAt":"2026-11-09T09:55:59.448652734Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f44d48c2-4151-4506-8879-78afaaa7fc88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f44d48c2-4151-4506-8879-78afaaa7fc88
Content-Type: application/json

--- request body ---
{"handle":"qa-3520b2570595","displayName":"QA 3520b2570595","password":"****","region":"eu"}

--- response: 201 in 80 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f44d48c2-4151-4506-8879-78afaaa7fc88
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
Location: /v1/accounts/qa-3520b2570595
X-Served-Region: eu
Content-Length: 181

{"id":"acc_44b2f045-ab75-4b0a-a05b-e76fd7d1bbe4","handle":"qa-3520b2570595","displayName":"QA 3520b2570595","region":"eu","role":"user","createdAt":"2026-11-09T09:55:59.864373906Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5c26a228-ba33-43a9-bd9d-8475ed6f1108

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c26a228-ba33-43a9-bd9d-8475ed6f1108
Content-Type: application/json

--- request body ---
{"handle":"qa-fad52ea2225c","password":"****"}

--- response: 200 in 23 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c26a228-ba33-43a9-bd9d-8475ed6f1108
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_488c8dd7-8690-4959-8770-cc85e5e6078a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8f61ea65-2259-4234-b7ed-e34f12efd1dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f61ea65-2259-4234-b7ed-e34f12efd1dd
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3520b2570595","subject":"Across regions","message":"Namaste"}

--- response: 201 in 87 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f61ea65-2259-4234-b7ed-e34f12efd1dd
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
Location: /v1/conversations/cnv_7586bbb2-b83a-427e-97e8-d4c0d6c43f84
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7586bbb2-b83a-427e-97e8-d4c0d6c43f84","subject":"Across regions","status":"open","region":"eu","participants":["qa-fad52ea2225c","qa-3520b2570595"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:00.065892519Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_7586bbb2-b83a-427e-97e8-d4c0d6c43f84
correlation: qa-a817432d-a455-4695-b68e-145460f0c4b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a817432d-a455-4695-b68e-145460f0c4b8
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-a817432d-a455-4695-b68e-145460f0c4b8
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

{"id":"cnv_7586bbb2-b83a-427e-97e8-d4c0d6c43f84","subject":"Across regions","status":"open","region":"eu","participants":["qa-fad52ea2225c","qa-3520b2570595"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:00.065892519Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-25f95e3b-db39-47c5-b443-5614e525d42c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25f95e3b-db39-47c5-b443-5614e525d42c
Content-Type: application/json

--- request body ---
{"handle":"qa-3520b2570595","password":"****"}

--- response: 200 in 22 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-25f95e3b-db39-47c5-b443-5614e525d42c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_44b2f045-ab75-4b0a-a05b-e76fd7d1bbe4"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_7586bbb2-b83a-427e-97e8-d4c0d6c43f84
correlation: qa-e7a82142-1458-472e-862e-ba78310e6f9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7a82142-1458-472e-862e-ba78310e6f9f
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-e7a82142-1458-472e-862e-ba78310e6f9f
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

{"id":"cnv_7586bbb2-b83a-427e-97e8-d4c0d6c43f84","subject":"Across regions","status":"open","region":"eu","participants":["qa-fad52ea2225c","qa-3520b2570595"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-09T09:56:00.065892519Z"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b4c1f9df-6946-45b3-8796-14f293a8462c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4c1f9df-6946-45b3-8796-14f293a8462c
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b4c1f9df-6946-45b3-8796-14f293a8462c
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
correlation: qa-60fb0428-e262-4e56-82fa-941978d718d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60fb0428-e262-4e56-82fa-941978d718d4
Content-Type: application/json

--- request body ---
{"handle":"qa-3520b2570595","password":"****"}

--- response: 401 in 30 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-60fb0428-e262-4e56-82fa-941978d718d4
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-60fb0428-e262-4e56-82fa-941978d718d4"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-70dfd5e6-8ce6-4f8f-91d7-69da525d9040

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70dfd5e6-8ce6-4f8f-91d7-69da525d9040
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-70dfd5e6-8ce6-4f8f-91d7-69da525d9040
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
correlation: qa-51ae1b0e-4f7b-4721-9966-5fe16954767d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51ae1b0e-4f7b-4721-9966-5fe16954767d
Content-Type: application/json

--- request body ---
{"handle":"qa-fad52ea2225c","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-51ae1b0e-4f7b-4721-9966-5fe16954767d
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-51ae1b0e-4f7b-4721-9966-5fe16954767d"}
```

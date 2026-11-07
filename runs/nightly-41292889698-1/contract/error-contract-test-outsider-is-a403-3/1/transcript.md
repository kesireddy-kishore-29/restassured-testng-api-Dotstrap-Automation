# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[3]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 404 | `qa-b2e35511-3157-4992-ac42-1e808cee53a7` |
| 2 | `POST /v1/accounts` | 201 | 78 | `qa-766bb473-7ea4-4193-8c85-3799064bdf83` |
| 3 | `POST /v1/accounts` | 201 | 50 | `qa-dbe95ced-62c0-401e-93f9-7543088224ed` |
| 4 | `POST /v1/auth/token` | 200 | 52 | `qa-cc9a1ad0-b6e6-41f1-a0e3-33c27c3bc741` |
| 5 | `POST /v1/conversations` | 201 | 44 | `qa-7edffac3-d878-4c5a-91eb-9f8319352a2c` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-d23d660f-ab2c-45c5-a63b-03c7399c7250` |
| 7 | `POST /v1/conversations/{id}/read` | 403 | 9 | `qa-ab6ab4a1-595f-478b-bffe-fa50f05b579b` |
| 8 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-6a033fd2-e211-419b-abea-9800067b02d2` |
| 9 | `POST /v1/auth/token` | 401 | 29 | `qa-f7bd3544-fc4c-4f7f-a839-b89fe7ac2148` |
| 10 | `POST /v1/auth/token` | 200 | 66 | `qa-f003e8c2-c768-436d-ad30-e736bd4a41c4` |
| 11 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-8272799e-3f74-47da-b13f-2c721afde970` |
| 12 | `POST /v1/auth/token` | 401 | 23 | `qa-d8d01455-8d61-48ed-b80c-eb7d6ec59723` |
| 13 | `DELETE /v1/accounts/me` | 204 | 40 | `qa-ce7acbe6-ce3f-45c3-b1ae-1e0590253821` |
| 14 | `POST /v1/auth/token` | 401 | 21 | `qa-52a4f57f-aced-4caf-94e5-fb4a1717ce6d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b2e35511-3157-4992-ac42-1e808cee53a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2e35511-3157-4992-ac42-1e808cee53a7
Content-Type: application/json

--- request body ---
{"handle":"qa-12d5f53bae1c","displayName":"QA 12d5f53bae1c","password":"****","region":"eu"}

--- response: 201 in 404 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2e35511-3157-4992-ac42-1e808cee53a7
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
Location: /v1/accounts/qa-12d5f53bae1c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_17eae0cf-bcf4-4b44-b8b9-9610da269c09","handle":"qa-12d5f53bae1c","displayName":"QA 12d5f53bae1c","region":"eu","role":"user","createdAt":"2026-11-01T09:23:20.334749631Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-766bb473-7ea4-4193-8c85-3799064bdf83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-766bb473-7ea4-4193-8c85-3799064bdf83
Content-Type: application/json

--- request body ---
{"handle":"qa-8c779ee92671","displayName":"QA 8c779ee92671","password":"****","region":"eu"}

--- response: 201 in 78 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-766bb473-7ea4-4193-8c85-3799064bdf83
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
Location: /v1/accounts/qa-8c779ee92671
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9a87d560-ecd3-4d6f-bdc7-403dc3a54243","handle":"qa-8c779ee92671","displayName":"QA 8c779ee92671","region":"eu","role":"user","createdAt":"2026-11-01T09:23:20.813592349Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-dbe95ced-62c0-401e-93f9-7543088224ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbe95ced-62c0-401e-93f9-7543088224ed
Content-Type: application/json

--- request body ---
{"handle":"qa-cdab54dcc31c","displayName":"QA cdab54dcc31c","password":"****","region":"eu"}

--- response: 201 in 50 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-dbe95ced-62c0-401e-93f9-7543088224ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 10
Location: /v1/accounts/qa-cdab54dcc31c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_51a76202-cf25-4146-ab75-ea23f0a68d09","handle":"qa-cdab54dcc31c","displayName":"QA cdab54dcc31c","region":"eu","role":"user","createdAt":"2026-11-01T09:23:20.898248438Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-cc9a1ad0-b6e6-41f1-a0e3-33c27c3bc741

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc9a1ad0-b6e6-41f1-a0e3-33c27c3bc741
Content-Type: application/json

--- request body ---
{"handle":"qa-12d5f53bae1c","password":"****"}

--- response: 200 in 52 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc9a1ad0-b6e6-41f1-a0e3-33c27c3bc741
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 556
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_17eae0cf-bcf4-4b44-b8b9-9610da269c09"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-7edffac3-d878-4c5a-91eb-9f8319352a2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7edffac3-d878-4c5a-91eb-9f8319352a2c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8c779ee92671","subject":"Error contract","message":"Hi"}

--- response: 201 in 44 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-7edffac3-d878-4c5a-91eb-9f8319352a2c
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
Location: /v1/conversations/cnv_f1e063a1-f66f-4d79-b825-b94d66ad5213
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f1e063a1-f66f-4d79-b825-b94d66ad5213","subject":"Error contract","status":"open","region":"eu","participants":["qa-12d5f53bae1c","qa-8c779ee92671"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:21.071625066Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d23d660f-ab2c-45c5-a63b-03c7399c7250

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d23d660f-ab2c-45c5-a63b-03c7399c7250
Content-Type: application/json

--- request body ---
{"handle":"qa-cdab54dcc31c","password":"****"}

--- response: 200 in 33 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-d23d660f-ab2c-45c5-a63b-03c7399c7250
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 548
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_51a76202-cf25-4146-ab75-ea23f0a68d09"}
```

## 7. POST /v1/conversations/{id}/read

```text
#7 POST http://localhost:7070/v1/conversations/cnv_f1e063a1-f66f-4d79-b825-b94d66ad5213/read
correlation: qa-ab6ab4a1-595f-478b-bffe-fa50f05b579b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab6ab4a1-595f-478b-bffe-fa50f05b579b
Content-Type: application/json

--- response: 403 in 9 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ab6ab4a1-595f-478b-bffe-fa50f05b579b
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
Content-Length: 290

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_f1e063a1-f66f-4d79-b825-b94d66ad5213/read","correlationId":"qa-ab6ab4a1-595f-478b-bffe-fa50f05b579b"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6a033fd2-e211-419b-abea-9800067b02d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a033fd2-e211-419b-abea-9800067b02d2
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6a033fd2-e211-419b-abea-9800067b02d2
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
correlation: qa-f7bd3544-fc4c-4f7f-a839-b89fe7ac2148

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7bd3544-fc4c-4f7f-a839-b89fe7ac2148
Content-Type: application/json

--- request body ---
{"handle":"qa-cdab54dcc31c","password":"****"}

--- response: 401 in 29 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f7bd3544-fc4c-4f7f-a839-b89fe7ac2148
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 539
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f7bd3544-fc4c-4f7f-a839-b89fe7ac2148"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-f003e8c2-c768-436d-ad30-e736bd4a41c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f003e8c2-c768-436d-ad30-e736bd4a41c4
Content-Type: application/json

--- request body ---
{"handle":"qa-8c779ee92671","password":"****"}

--- response: 200 in 66 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-f003e8c2-c768-436d-ad30-e736bd4a41c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 532
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9a87d560-ecd3-4d6f-bdc7-403dc3a54243"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8272799e-3f74-47da-b13f-2c721afde970

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8272799e-3f74-47da-b13f-2c721afde970
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8272799e-3f74-47da-b13f-2c721afde970
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
correlation: qa-d8d01455-8d61-48ed-b80c-eb7d6ec59723

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8d01455-8d61-48ed-b80c-eb7d6ec59723
Content-Type: application/json

--- request body ---
{"handle":"qa-8c779ee92671","password":"****"}

--- response: 401 in 23 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d8d01455-8d61-48ed-b80c-eb7d6ec59723
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 520
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d8d01455-8d61-48ed-b80c-eb7d6ec59723"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ce7acbe6-ce3f-45c3-b1ae-1e0590253821

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce7acbe6-ce3f-45c3-b1ae-1e0590253821
Content-Type: application/json

--- response: 204 in 40 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ce7acbe6-ce3f-45c3-b1ae-1e0590253821
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
correlation: qa-52a4f57f-aced-4caf-94e5-fb4a1717ce6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52a4f57f-aced-4caf-94e5-fb4a1717ce6d
Content-Type: application/json

--- request body ---
{"handle":"qa-12d5f53bae1c","password":"****"}

--- response: 401 in 21 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-52a4f57f-aced-4caf-94e5-fb4a1717ce6d
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-52a4f57f-aced-4caf-94e5-fb4a1717ce6d"}
```

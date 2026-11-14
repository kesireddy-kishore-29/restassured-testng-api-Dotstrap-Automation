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
| 1 | `POST /v1/accounts` | 201 | 368 | `qa-2393f140-5a6a-4e05-9f6f-2db390e2c87c` |
| 2 | `POST /v1/accounts` | 201 | 53 | `qa-e8d25465-57e9-4c48-9cee-9c7cc2562ba4` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-4d15a0c5-1934-453c-93d7-12d9f5147591` |
| 4 | `POST /v1/conversations` | 201 | 64 | `qa-b51e8441-a1a1-45cd-81f6-b117760be67e` |
| 5 | `GET /v1/conversations/{id}` | 200 | 49 | `qa-f120f79f-3081-4770-a18e-072825c66f08` |
| 6 | `POST /v1/auth/token` | 200 | 10 | `qa-05ba057a-a486-40cf-b8c9-f77c18a919c9` |
| 7 | `GET /v1/conversations/{id}` | 200 | 7 | `qa-da5cb446-79e4-42d7-a29f-85c4eeacef52` |
| 8 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-0bba42d2-ca2e-4039-b833-44990898506a` |
| 9 | `POST /v1/auth/token` | 401 | 32 | `qa-d46af860-88a4-44a4-8801-15d6c1605db6` |
| 10 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-28e3c25b-29d6-46ce-a86c-c3bbbf74d35f` |
| 11 | `POST /v1/auth/token` | 401 | 10 | `qa-c9db14fd-f671-43e2-947e-afc02d058b5d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2393f140-5a6a-4e05-9f6f-2db390e2c87c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2393f140-5a6a-4e05-9f6f-2db390e2c87c
Content-Type: application/json

--- request body ---
{"handle":"qa-4076b403af78","displayName":"QA 4076b403af78","password":"****","region":"in"}

--- response: 201 in 368 ms ---
Date: Sun, 08 Nov 2026 09:09:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-2393f140-5a6a-4e05-9f6f-2db390e2c87c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-4076b403af78
X-Served-Region: in
Content-Length: 181

{"id":"acc_9f1770fc-fd62-40de-b15d-be75467c8440","handle":"qa-4076b403af78","displayName":"QA 4076b403af78","region":"in","role":"user","createdAt":"2026-11-08T09:09:09.532285452Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e8d25465-57e9-4c48-9cee-9c7cc2562ba4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8d25465-57e9-4c48-9cee-9c7cc2562ba4
Content-Type: application/json

--- request body ---
{"handle":"qa-78dfcc96d46a","displayName":"QA 78dfcc96d46a","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Sun, 08 Nov 2026 09:09:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8d25465-57e9-4c48-9cee-9c7cc2562ba4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-78dfcc96d46a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_adbaefb9-2e54-49a3-9304-0c9a8133c2be","handle":"qa-78dfcc96d46a","displayName":"QA 78dfcc96d46a","region":"eu","role":"user","createdAt":"2026-11-08T09:09:09.825890699Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4d15a0c5-1934-453c-93d7-12d9f5147591

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d15a0c5-1934-453c-93d7-12d9f5147591
Content-Type: application/json

--- request body ---
{"handle":"qa-4076b403af78","password":"****"}

--- response: 200 in 33 ms ---
Date: Sun, 08 Nov 2026 09:09:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d15a0c5-1934-453c-93d7-12d9f5147591
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9f1770fc-fd62-40de-b15d-be75467c8440"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b51e8441-a1a1-45cd-81f6-b117760be67e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b51e8441-a1a1-45cd-81f6-b117760be67e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-78dfcc96d46a","subject":"Across regions","message":"Namaste"}

--- response: 201 in 64 ms ---
Date: Sun, 08 Nov 2026 09:09:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-b51e8441-a1a1-45cd-81f6-b117760be67e
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
Location: /v1/conversations/cnv_9c9b4f9a-e495-4391-bc27-6b1caf84aa25
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9c9b4f9a-e495-4391-bc27-6b1caf84aa25","subject":"Across regions","status":"open","region":"eu","participants":["qa-4076b403af78","qa-78dfcc96d46a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:09.981123018Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_9c9b4f9a-e495-4391-bc27-6b1caf84aa25
correlation: qa-f120f79f-3081-4770-a18e-072825c66f08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f120f79f-3081-4770-a18e-072825c66f08
Content-Type: application/json

--- response: 200 in 49 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-f120f79f-3081-4770-a18e-072825c66f08
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

{"id":"cnv_9c9b4f9a-e495-4391-bc27-6b1caf84aa25","subject":"Across regions","status":"open","region":"eu","participants":["qa-4076b403af78","qa-78dfcc96d46a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:09.981123018Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-05ba057a-a486-40cf-b8c9-f77c18a919c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05ba057a-a486-40cf-b8c9-f77c18a919c9
Content-Type: application/json

--- request body ---
{"handle":"qa-78dfcc96d46a","password":"****"}

--- response: 200 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-05ba057a-a486-40cf-b8c9-f77c18a919c9
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_adbaefb9-2e54-49a3-9304-0c9a8133c2be"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_9c9b4f9a-e495-4391-bc27-6b1caf84aa25
correlation: qa-da5cb446-79e4-42d7-a29f-85c4eeacef52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da5cb446-79e4-42d7-a29f-85c4eeacef52
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-da5cb446-79e4-42d7-a29f-85c4eeacef52
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

{"id":"cnv_9c9b4f9a-e495-4391-bc27-6b1caf84aa25","subject":"Across regions","status":"open","region":"eu","participants":["qa-4076b403af78","qa-78dfcc96d46a"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-08T09:09:09.981123018Z"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0bba42d2-ca2e-4039-b833-44990898506a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0bba42d2-ca2e-4039-b833-44990898506a
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0bba42d2-ca2e-4039-b833-44990898506a
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
correlation: qa-d46af860-88a4-44a4-8801-15d6c1605db6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d46af860-88a4-44a4-8801-15d6c1605db6
Content-Type: application/json

--- request body ---
{"handle":"qa-78dfcc96d46a","password":"****"}

--- response: 401 in 32 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d46af860-88a4-44a4-8801-15d6c1605db6
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d46af860-88a4-44a4-8801-15d6c1605db6"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-28e3c25b-29d6-46ce-a86c-c3bbbf74d35f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28e3c25b-29d6-46ce-a86c-c3bbbf74d35f
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-28e3c25b-29d6-46ce-a86c-c3bbbf74d35f
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
correlation: qa-c9db14fd-f671-43e2-947e-afc02d058b5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9db14fd-f671-43e2-947e-afc02d058b5d
Content-Type: application/json

--- request body ---
{"handle":"qa-4076b403af78","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c9db14fd-f671-43e2-947e-afc02d058b5d
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c9db14fd-f671-43e2-947e-afc02d058b5d"}
```

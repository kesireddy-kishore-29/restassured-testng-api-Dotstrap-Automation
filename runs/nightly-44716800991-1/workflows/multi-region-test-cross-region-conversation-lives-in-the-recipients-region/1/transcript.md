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
| 1 | `POST /v1/accounts` | 201 | 490 | `qa-248d676c-479d-463a-94b5-43f903d484f9` |
| 2 | `POST /v1/accounts` | 201 | 59 | `qa-a1cf2134-d2d8-4343-a3e2-155d246490b5` |
| 3 | `POST /v1/auth/token` | 200 | 43 | `qa-4859a904-e7b4-45fc-960f-6f451e6b67e5` |
| 4 | `POST /v1/conversations` | 201 | 76 | `qa-d1fcebae-ae9a-4db6-b185-974362a1f713` |
| 5 | `GET /v1/conversations/{id}` | 200 | 33 | `qa-1408da6d-1379-48a6-a770-2c18509e8ac2` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-fd53fb65-eb05-4a87-b3db-675bd1975267` |
| 7 | `GET /v1/conversations/{id}` | 200 | 10 | `qa-189a71ed-ad0f-479c-811d-68eaca221204` |
| 8 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-7c8c75c4-7e69-47ce-bcd8-d7cf7413aed3` |
| 9 | `POST /v1/auth/token` | 401 | 11 | `qa-b60cd6b7-87f0-4393-aa56-78ff60f072cf` |
| 10 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-9cb09fad-7a20-4eff-aee3-97fd1823d95e` |
| 11 | `POST /v1/auth/token` | 401 | 10 | `qa-efa9766f-9305-4942-9529-7fe43ebcb343` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-248d676c-479d-463a-94b5-43f903d484f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-248d676c-479d-463a-94b5-43f903d484f9
Content-Type: application/json

--- request body ---
{"handle":"qa-fe974d7291c1","displayName":"QA fe974d7291c1","password":"****","region":"in"}

--- response: 201 in 490 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-248d676c-479d-463a-94b5-43f903d484f9
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
Location: /v1/accounts/qa-fe974d7291c1
X-Served-Region: in
Content-Length: 181

{"id":"acc_39808e54-1a06-468e-b023-9a618e9ff8e9","handle":"qa-fe974d7291c1","displayName":"QA fe974d7291c1","region":"in","role":"user","createdAt":"2026-11-20T10:10:02.197358788Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a1cf2134-d2d8-4343-a3e2-155d246490b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1cf2134-d2d8-4343-a3e2-155d246490b5
Content-Type: application/json

--- request body ---
{"handle":"qa-6d87115b7866","displayName":"QA 6d87115b7866","password":"****","region":"eu"}

--- response: 201 in 59 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-a1cf2134-d2d8-4343-a3e2-155d246490b5
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
Location: /v1/accounts/qa-6d87115b7866
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9e8fcefd-e924-4784-9f0d-6fe5777383a5","handle":"qa-6d87115b7866","displayName":"QA 6d87115b7866","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.646005063Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4859a904-e7b4-45fc-960f-6f451e6b67e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4859a904-e7b4-45fc-960f-6f451e6b67e5
Content-Type: application/json

--- request body ---
{"handle":"qa-fe974d7291c1","password":"****"}

--- response: 200 in 43 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-4859a904-e7b4-45fc-960f-6f451e6b67e5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_39808e54-1a06-468e-b023-9a618e9ff8e9"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d1fcebae-ae9a-4db6-b185-974362a1f713

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1fcebae-ae9a-4db6-b185-974362a1f713
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6d87115b7866","subject":"Across regions","message":"Namaste"}

--- response: 201 in 76 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-d1fcebae-ae9a-4db6-b185-974362a1f713
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
Location: /v1/conversations/cnv_c9569953-00ed-4ddc-9dba-33a85c41fc99
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c9569953-00ed-4ddc-9dba-33a85c41fc99","subject":"Across regions","status":"open","region":"eu","participants":["qa-fe974d7291c1","qa-6d87115b7866"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:02.820291138Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_c9569953-00ed-4ddc-9dba-33a85c41fc99
correlation: qa-1408da6d-1379-48a6-a770-2c18509e8ac2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1408da6d-1379-48a6-a770-2c18509e8ac2
Content-Type: application/json

--- response: 200 in 33 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-1408da6d-1379-48a6-a770-2c18509e8ac2
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

{"id":"cnv_c9569953-00ed-4ddc-9dba-33a85c41fc99","subject":"Across regions","status":"open","region":"eu","participants":["qa-fe974d7291c1","qa-6d87115b7866"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:02.820291138Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-fd53fb65-eb05-4a87-b3db-675bd1975267

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd53fb65-eb05-4a87-b3db-675bd1975267
Content-Type: application/json

--- request body ---
{"handle":"qa-6d87115b7866","password":"****"}

--- response: 200 in 24 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd53fb65-eb05-4a87-b3db-675bd1975267
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9e8fcefd-e924-4784-9f0d-6fe5777383a5"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_c9569953-00ed-4ddc-9dba-33a85c41fc99
correlation: qa-189a71ed-ad0f-479c-811d-68eaca221204

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-189a71ed-ad0f-479c-811d-68eaca221204
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-189a71ed-ad0f-479c-811d-68eaca221204
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

{"id":"cnv_c9569953-00ed-4ddc-9dba-33a85c41fc99","subject":"Across regions","status":"open","region":"eu","participants":["qa-fe974d7291c1","qa-6d87115b7866"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-20T10:10:02.820291138Z"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7c8c75c4-7e69-47ce-bcd8-d7cf7413aed3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c8c75c4-7e69-47ce-bcd8-d7cf7413aed3
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7c8c75c4-7e69-47ce-bcd8-d7cf7413aed3
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
correlation: qa-b60cd6b7-87f0-4393-aa56-78ff60f072cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b60cd6b7-87f0-4393-aa56-78ff60f072cf
Content-Type: application/json

--- request body ---
{"handle":"qa-6d87115b7866","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b60cd6b7-87f0-4393-aa56-78ff60f072cf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b60cd6b7-87f0-4393-aa56-78ff60f072cf"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9cb09fad-7a20-4eff-aee3-97fd1823d95e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cb09fad-7a20-4eff-aee3-97fd1823d95e
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9cb09fad-7a20-4eff-aee3-97fd1823d95e
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
correlation: qa-efa9766f-9305-4942-9529-7fe43ebcb343

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-efa9766f-9305-4942-9529-7fe43ebcb343
Content-Type: application/json

--- request body ---
{"handle":"qa-fe974d7291c1","password":"****"}

--- response: 401 in 10 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-efa9766f-9305-4942-9529-7fe43ebcb343
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-efa9766f-9305-4942-9529-7fe43ebcb343"}
```

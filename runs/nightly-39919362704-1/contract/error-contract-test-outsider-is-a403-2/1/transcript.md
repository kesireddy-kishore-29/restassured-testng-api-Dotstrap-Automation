# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[2]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-0d46b750-3590-478b-ac74-329d1d0b440e` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-64e291a7-b46e-4f53-8173-a52828d3966e` |
| 3 | `POST /v1/accounts` | 201 | 25 | `qa-46d30852-b604-4204-b155-09524e045dbf` |
| 4 | `POST /v1/auth/token` | 200 | 19 | `qa-f390eba5-29a0-4223-9440-449d3608cc31` |
| 5 | `POST /v1/conversations` | 201 | 12 | `qa-beb85290-7fcc-441b-ae55-b4f2d158f1d4` |
| 6 | `POST /v1/auth/token` | 200 | 36 | `qa-91a86627-7cec-4a2f-abee-aa3e106c7589` |
| 7 | `POST /v1/conversations/{id}/messages` | 403 | 13 | `qa-10b07a7c-c002-46ed-aef8-abbcb46c619b` |
| 8 | `DELETE /v1/accounts/me` | 204 | 57 | `qa-fef64d68-d7b3-49c5-a9cf-d9ea5098c95a` |
| 9 | `POST /v1/auth/token` | 401 | 55 | `qa-0bd16796-28e6-4e6c-9b69-31cc4f7e7306` |
| 10 | `POST /v1/auth/token` | 200 | 45 | `qa-88f3b63c-6fe5-431e-b870-c6711fda065f` |
| 11 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-951f8110-dc6b-4686-a6cf-948564beee64` |
| 12 | `POST /v1/auth/token` | 401 | 25 | `qa-a59b0d5a-9518-4569-b0e1-47c47c217a44` |
| 13 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-c643d622-edaf-4f65-8e65-1dfff9a47f31` |
| 14 | `POST /v1/auth/token` | 401 | 43 | `qa-9562cc68-daed-4f3a-8c72-894a498e68f2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0d46b750-3590-478b-ac74-329d1d0b440e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d46b750-3590-478b-ac74-329d1d0b440e
Content-Type: application/json

--- request body ---
{"handle":"qa-d73782498e11","displayName":"QA d73782498e11","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d46b750-3590-478b-ac74-329d1d0b440e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 543
RateLimit-Reset: 9
Location: /v1/accounts/qa-d73782498e11
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49f1ccf3-d262-4025-93fc-f0b42e97efd0","handle":"qa-d73782498e11","displayName":"QA d73782498e11","region":"eu","role":"user","createdAt":"2026-10-23T07:41:43.994455377Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-64e291a7-b46e-4f53-8173-a52828d3966e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64e291a7-b46e-4f53-8173-a52828d3966e
Content-Type: application/json

--- request body ---
{"handle":"qa-769b4abb6019","displayName":"QA 769b4abb6019","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Fri, 23 Oct 2026 07:41:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-64e291a7-b46e-4f53-8173-a52828d3966e
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
Location: /v1/accounts/qa-769b4abb6019
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a6f273a7-86fc-48e4-8a05-6a879351eca6","handle":"qa-769b4abb6019","displayName":"QA 769b4abb6019","region":"eu","role":"user","createdAt":"2026-10-23T07:41:44.036848999Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-46d30852-b604-4204-b155-09524e045dbf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46d30852-b604-4204-b155-09524e045dbf
Content-Type: application/json

--- request body ---
{"handle":"qa-7dd380cd7153","displayName":"QA 7dd380cd7153","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Fri, 23 Oct 2026 07:41:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-46d30852-b604-4204-b155-09524e045dbf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 534
RateLimit-Reset: 9
Location: /v1/accounts/qa-7dd380cd7153
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c9fee2b4-55da-4d05-80c2-d7656ccd8fc9","handle":"qa-7dd380cd7153","displayName":"QA 7dd380cd7153","region":"eu","role":"user","createdAt":"2026-10-23T07:41:44.079244325Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-f390eba5-29a0-4223-9440-449d3608cc31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f390eba5-29a0-4223-9440-449d3608cc31
Content-Type: application/json

--- request body ---
{"handle":"qa-d73782498e11","password":"****"}

--- response: 200 in 19 ms ---
Date: Fri, 23 Oct 2026 07:41:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-f390eba5-29a0-4223-9440-449d3608cc31
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_49f1ccf3-d262-4025-93fc-f0b42e97efd0"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-beb85290-7fcc-441b-ae55-b4f2d158f1d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-beb85290-7fcc-441b-ae55-b4f2d158f1d4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-769b4abb6019","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Fri, 23 Oct 2026 07:41:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-beb85290-7fcc-441b-ae55-b4f2d158f1d4
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
Location: /v1/conversations/cnv_34e986ea-2c83-454b-a63d-86a0e84c5c3b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_34e986ea-2c83-454b-a63d-86a0e84c5c3b","subject":"Error contract","status":"open","region":"eu","participants":["qa-d73782498e11","qa-769b4abb6019"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:44.164897582Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-91a86627-7cec-4a2f-abee-aa3e106c7589

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91a86627-7cec-4a2f-abee-aa3e106c7589
Content-Type: application/json

--- request body ---
{"handle":"qa-7dd380cd7153","password":"****"}

--- response: 200 in 36 ms ---
Date: Fri, 23 Oct 2026 07:41:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-91a86627-7cec-4a2f-abee-aa3e106c7589
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 528
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c9fee2b4-55da-4d05-80c2-d7656ccd8fc9"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_34e986ea-2c83-454b-a63d-86a0e84c5c3b/messages
correlation: qa-10b07a7c-c002-46ed-aef8-abbcb46c619b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10b07a7c-c002-46ed-aef8-abbcb46c619b
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 403 in 13 ms ---
Date: Fri, 23 Oct 2026 07:41:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-10b07a7c-c002-46ed-aef8-abbcb46c619b
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_34e986ea-2c83-454b-a63d-86a0e84c5c3b/messages","correlationId":"qa-10b07a7c-c002-46ed-aef8-abbcb46c619b"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fef64d68-d7b3-49c5-a9cf-d9ea5098c95a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fef64d68-d7b3-49c5-a9cf-d9ea5098c95a
Content-Type: application/json

--- response: 204 in 57 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fef64d68-d7b3-49c5-a9cf-d9ea5098c95a
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
correlation: qa-0bd16796-28e6-4e6c-9b69-31cc4f7e7306

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0bd16796-28e6-4e6c-9b69-31cc4f7e7306
Content-Type: application/json

--- request body ---
{"handle":"qa-7dd380cd7153","password":"****"}

--- response: 401 in 55 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0bd16796-28e6-4e6c-9b69-31cc4f7e7306
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 509
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0bd16796-28e6-4e6c-9b69-31cc4f7e7306"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-88f3b63c-6fe5-431e-b870-c6711fda065f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88f3b63c-6fe5-431e-b870-c6711fda065f
Content-Type: application/json

--- request body ---
{"handle":"qa-769b4abb6019","password":"****"}

--- response: 200 in 45 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-88f3b63c-6fe5-431e-b870-c6711fda065f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 496
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a6f273a7-86fc-48e4-8a05-6a879351eca6"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-951f8110-dc6b-4686-a6cf-948564beee64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-951f8110-dc6b-4686-a6cf-948564beee64
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-951f8110-dc6b-4686-a6cf-948564beee64
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
correlation: qa-a59b0d5a-9518-4569-b0e1-47c47c217a44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a59b0d5a-9518-4569-b0e1-47c47c217a44
Content-Type: application/json

--- request body ---
{"handle":"qa-769b4abb6019","password":"****"}

--- response: 401 in 25 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a59b0d5a-9518-4569-b0e1-47c47c217a44
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 480
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a59b0d5a-9518-4569-b0e1-47c47c217a44"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c643d622-edaf-4f65-8e65-1dfff9a47f31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c643d622-edaf-4f65-8e65-1dfff9a47f31
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c643d622-edaf-4f65-8e65-1dfff9a47f31
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
correlation: qa-9562cc68-daed-4f3a-8c72-894a498e68f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9562cc68-daed-4f3a-8c72-894a498e68f2
Content-Type: application/json

--- request body ---
{"handle":"qa-d73782498e11","password":"****"}

--- response: 401 in 43 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9562cc68-daed-4f3a-8c72-894a498e68f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 471
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9562cc68-daed-4f3a-8c72-894a498e68f2"}
```

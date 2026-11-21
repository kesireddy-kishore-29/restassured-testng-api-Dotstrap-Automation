# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[12]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-1d3a060e-feeb-491b-8d72-f3cf2f268918` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-07a15102-091d-46d0-b20c-4ee7a8929597` |
| 3 | `POST /v1/auth/token` | 200 | 35 | `qa-9ca722cd-7c49-4ef8-9438-1aac21436b44` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-9ead452b-262b-4585-877a-f1a240228280` |
| 5 | `POST /v1/conversations/{id}/messages` | 400 | 11 | `qa-acf73ad0-9429-413c-a129-f7ab4b29f41d` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-44326a92-18a2-4151-9b87-35b52cf8a524` |
| 7 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-5a92c067-c346-42f9-a519-8cb5c044fa13` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-27a9658a-a296-4439-9cdf-2868df4d8f36` |
| 9 | `DELETE /v1/accounts/me` | 204 | 35 | `qa-3fe8a517-706f-47d8-b4ff-b36eb5c2df7c` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-77d08cbf-fbf6-4ef7-a43d-b43abb69aa83` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1d3a060e-feeb-491b-8d72-f3cf2f268918

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d3a060e-feeb-491b-8d72-f3cf2f268918
Content-Type: application/json

--- request body ---
{"handle":"qa-ecf7699fb4e0","displayName":"QA ecf7699fb4e0","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d3a060e-feeb-491b-8d72-f3cf2f268918
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 359
RateLimit-Reset: 8
Location: /v1/accounts/qa-ecf7699fb4e0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7335e262-af2c-4e3d-8849-223890ec2e35","handle":"qa-ecf7699fb4e0","displayName":"QA ecf7699fb4e0","region":"eu","role":"user","createdAt":"2026-11-18T10:19:52.583160473Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-07a15102-091d-46d0-b20c-4ee7a8929597

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07a15102-091d-46d0-b20c-4ee7a8929597
Content-Type: application/json

--- request body ---
{"handle":"qa-480763c5489b","displayName":"QA 480763c5489b","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-07a15102-091d-46d0-b20c-4ee7a8929597
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 355
RateLimit-Reset: 8
Location: /v1/accounts/qa-480763c5489b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c28c41d8-7736-4534-9815-480f853f1ad5","handle":"qa-480763c5489b","displayName":"QA 480763c5489b","region":"eu","role":"user","createdAt":"2026-11-18T10:19:52.613480105Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9ca722cd-7c49-4ef8-9438-1aac21436b44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ca722cd-7c49-4ef8-9438-1aac21436b44
Content-Type: application/json

--- request body ---
{"handle":"qa-ecf7699fb4e0","password":"****"}

--- response: 200 in 35 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ca722cd-7c49-4ef8-9438-1aac21436b44
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 350
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7335e262-af2c-4e3d-8849-223890ec2e35"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9ead452b-262b-4585-877a-f1a240228280

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ead452b-262b-4585-877a-f1a240228280
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-480763c5489b","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ead452b-262b-4585-877a-f1a240228280
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
Location: /v1/conversations/cnv_e0e410ea-661f-48fb-ba6b-cb2758322659
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e0e410ea-661f-48fb-ba6b-cb2758322659","subject":"Error contract","status":"open","region":"eu","participants":["qa-ecf7699fb4e0","qa-480763c5489b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:52.689435800Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_e0e410ea-661f-48fb-ba6b-cb2758322659/messages
correlation: qa-acf73ad0-9429-413c-a129-f7ab4b29f41d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-acf73ad0-9429-413c-a129-f7ab4b29f41d
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 11 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-acf73ad0-9429-413c-a129-f7ab4b29f41d
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
Content-Length: 308

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations/cnv_e0e410ea-661f-48fb-ba6b-cb2758322659/messages","correlationId":"qa-acf73ad0-9429-413c-a129-f7ab4b29f41d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-44326a92-18a2-4151-9b87-35b52cf8a524

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44326a92-18a2-4151-9b87-35b52cf8a524
Content-Type: application/json

--- request body ---
{"handle":"qa-480763c5489b","password":"****"}

--- response: 200 in 25 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-44326a92-18a2-4151-9b87-35b52cf8a524
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 334
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c28c41d8-7736-4534-9815-480f853f1ad5"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5a92c067-c346-42f9-a519-8cb5c044fa13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a92c067-c346-42f9-a519-8cb5c044fa13
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5a92c067-c346-42f9-a519-8cb5c044fa13
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

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-27a9658a-a296-4439-9cdf-2868df4d8f36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27a9658a-a296-4439-9cdf-2868df4d8f36
Content-Type: application/json

--- request body ---
{"handle":"qa-480763c5489b","password":"****"}

--- response: 401 in 11 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-27a9658a-a296-4439-9cdf-2868df4d8f36
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 328
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-27a9658a-a296-4439-9cdf-2868df4d8f36"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3fe8a517-706f-47d8-b4ff-b36eb5c2df7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fe8a517-706f-47d8-b4ff-b36eb5c2df7c
Content-Type: application/json

--- response: 204 in 35 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3fe8a517-706f-47d8-b4ff-b36eb5c2df7c
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
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-77d08cbf-fbf6-4ef7-a43d-b43abb69aa83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77d08cbf-fbf6-4ef7-a43d-b43abb69aa83
Content-Type: application/json

--- request body ---
{"handle":"qa-ecf7699fb4e0","password":"****"}

--- response: 401 in 14 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-77d08cbf-fbf6-4ef7-a43d-b43abb69aa83
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 319
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-77d08cbf-fbf6-4ef7-a43d-b43abb69aa83"}
```

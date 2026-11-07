# Transcript: Someone outside a conversation gets 403, not its content

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.AuthBoundaryTest#outsiderCannotReadOrWriteAConversation` |
| Features | FEAT-AUTHZ-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 16 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 241 | `qa-fd1adfef-13cf-432a-9ce2-4e25025a36b8` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-e615064d-d325-4ab1-92b3-253aed6b4821` |
| 3 | `POST /v1/accounts` | 201 | 25 | `qa-01c42d73-2fb0-4c43-a7e3-59dc1e9403bc` |
| 4 | `POST /v1/auth/token` | 200 | 20 | `qa-bfff627f-e533-4ecb-8bf0-7f53d89d8d5f` |
| 5 | `POST /v1/conversations` | 201 | 21 | `qa-fde153b3-5527-436a-a0fe-9e2fabfbd2f7` |
| 6 | `POST /v1/auth/token` | 200 | 14 | `qa-6705693c-8176-4f54-8092-44c7d5ba556a` |
| 7 | `GET /v1/conversations/{id}` | 403 | 11 | `qa-f4fea580-dabf-4ba5-809c-8239132585d1` |
| 8 | `GET /v1/conversations/{id}/messages` | 403 | 11 | `qa-8779fc63-55a9-42de-9b63-b198eebe4a36` |
| 9 | `POST /v1/conversations/{id}/messages` | 403 | 11 | `qa-9a1ad243-6ae3-4ba7-b039-5e33b6adcc43` |
| 10 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-eea73695-9b60-4939-8df3-8270ef15e8dc` |
| 11 | `POST /v1/auth/token` | 401 | 8 | `qa-79d56d7f-4d85-4fdd-817c-d6a25beee301` |
| 12 | `POST /v1/auth/token` | 200 | 12 | `qa-e68e4ca9-0026-4428-8b9f-26ee1529ff09` |
| 13 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-ddf30bed-88dd-4d99-9fd9-9be90ffdd167` |
| 14 | `POST /v1/auth/token` | 401 | 8 | `qa-8203627f-3bb0-47a5-bf35-1e141531e53b` |
| 15 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-a3d9c841-d3e4-4ef0-a838-114e6cf287f8` |
| 16 | `POST /v1/auth/token` | 401 | 11 | `qa-487a3bdc-ae0e-47e4-bb7a-0dc2bcbac999` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fd1adfef-13cf-432a-9ce2-4e25025a36b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd1adfef-13cf-432a-9ce2-4e25025a36b8
Content-Type: application/json

--- request body ---
{"handle":"qa-8c4854e43d92","displayName":"QA 8c4854e43d92","password":"****","region":"eu"}

--- response: 201 in 241 ms ---
Date: Fri, 30 Oct 2026 08:45:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd1adfef-13cf-432a-9ce2-4e25025a36b8
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
Location: /v1/accounts/qa-8c4854e43d92
X-Served-Region: eu
Content-Length: 181

{"id":"acc_63df3e9e-3d1d-43d9-aaa1-3556cc29ceb0","handle":"qa-8c4854e43d92","displayName":"QA 8c4854e43d92","region":"eu","role":"user","createdAt":"2026-10-30T08:45:48.666684317Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e615064d-d325-4ab1-92b3-253aed6b4821

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e615064d-d325-4ab1-92b3-253aed6b4821
Content-Type: application/json

--- request body ---
{"handle":"qa-43c6fd46ed26","displayName":"QA 43c6fd46ed26","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Fri, 30 Oct 2026 08:45:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-e615064d-d325-4ab1-92b3-253aed6b4821
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
Location: /v1/accounts/qa-43c6fd46ed26
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a87d589b-0027-4565-8422-74e11905e1ec","handle":"qa-43c6fd46ed26","displayName":"QA 43c6fd46ed26","region":"eu","role":"user","createdAt":"2026-10-30T08:45:48.955620344Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-01c42d73-2fb0-4c43-a7e3-59dc1e9403bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01c42d73-2fb0-4c43-a7e3-59dc1e9403bc
Content-Type: application/json

--- request body ---
{"handle":"qa-77d120de3548","displayName":"QA 77d120de3548","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-01c42d73-2fb0-4c43-a7e3-59dc1e9403bc
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
Location: /v1/accounts/qa-77d120de3548
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c02cdc51-dd4a-4cc0-b97c-3502cb765b1e","handle":"qa-77d120de3548","displayName":"QA 77d120de3548","region":"eu","role":"user","createdAt":"2026-10-30T08:45:49.006109987Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-bfff627f-e533-4ecb-8bf0-7f53d89d8d5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bfff627f-e533-4ecb-8bf0-7f53d89d8d5f
Content-Type: application/json

--- request body ---
{"handle":"qa-8c4854e43d92","password":"****"}

--- response: 200 in 20 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-bfff627f-e533-4ecb-8bf0-7f53d89d8d5f
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_63df3e9e-3d1d-43d9-aaa1-3556cc29ceb0"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-fde153b3-5527-436a-a0fe-9e2fabfbd2f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fde153b3-5527-436a-a0fe-9e2fabfbd2f7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-43c6fd46ed26","subject":"Private","message":"Just us"}

--- response: 201 in 21 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-fde153b3-5527-436a-a0fe-9e2fabfbd2f7
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
Location: /v1/conversations/cnv_f76d9380-2c17-4120-95f2-39f0f5863165
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_f76d9380-2c17-4120-95f2-39f0f5863165","subject":"Private","status":"open","region":"eu","participants":["qa-8c4854e43d92","qa-43c6fd46ed26"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:45:49.079455950Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6705693c-8176-4f54-8092-44c7d5ba556a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6705693c-8176-4f54-8092-44c7d5ba556a
Content-Type: application/json

--- request body ---
{"handle":"qa-77d120de3548","password":"****"}

--- response: 200 in 14 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-6705693c-8176-4f54-8092-44c7d5ba556a
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c02cdc51-dd4a-4cc0-b97c-3502cb765b1e"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_f76d9380-2c17-4120-95f2-39f0f5863165
correlation: qa-f4fea580-dabf-4ba5-809c-8239132585d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4fea580-dabf-4ba5-809c-8239132585d1
Content-Type: application/json

--- response: 403 in 11 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f4fea580-dabf-4ba5-809c-8239132585d1
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
Content-Length: 285

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_f76d9380-2c17-4120-95f2-39f0f5863165","correlationId":"qa-f4fea580-dabf-4ba5-809c-8239132585d1"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_f76d9380-2c17-4120-95f2-39f0f5863165/messages
correlation: qa-8779fc63-55a9-42de-9b63-b198eebe4a36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8779fc63-55a9-42de-9b63-b198eebe4a36
Content-Type: application/json

--- response: 403 in 11 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8779fc63-55a9-42de-9b63-b198eebe4a36
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_f76d9380-2c17-4120-95f2-39f0f5863165/messages","correlationId":"qa-8779fc63-55a9-42de-9b63-b198eebe4a36"}
```

## 9. POST /v1/conversations/{id}/messages

```text
#9 POST http://localhost:7070/v1/conversations/cnv_f76d9380-2c17-4120-95f2-39f0f5863165/messages
correlation: qa-9a1ad243-6ae3-4ba7-b039-5e33b6adcc43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a1ad243-6ae3-4ba7-b039-5e33b6adcc43
Content-Type: application/json

--- request body ---
{"body":"Let me in"}

--- response: 403 in 11 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9a1ad243-6ae3-4ba7-b039-5e33b6adcc43
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_f76d9380-2c17-4120-95f2-39f0f5863165/messages","correlationId":"qa-9a1ad243-6ae3-4ba7-b039-5e33b6adcc43"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-eea73695-9b60-4939-8df3-8270ef15e8dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eea73695-9b60-4939-8df3-8270ef15e8dc
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-eea73695-9b60-4939-8df3-8270ef15e8dc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-79d56d7f-4d85-4fdd-817c-d6a25beee301

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79d56d7f-4d85-4fdd-817c-d6a25beee301
Content-Type: application/json

--- request body ---
{"handle":"qa-77d120de3548","password":"****"}

--- response: 401 in 8 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-79d56d7f-4d85-4fdd-817c-d6a25beee301
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-79d56d7f-4d85-4fdd-817c-d6a25beee301"}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-e68e4ca9-0026-4428-8b9f-26ee1529ff09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e68e4ca9-0026-4428-8b9f-26ee1529ff09
Content-Type: application/json

--- request body ---
{"handle":"qa-43c6fd46ed26","password":"****"}

--- response: 200 in 12 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-e68e4ca9-0026-4428-8b9f-26ee1529ff09
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a87d589b-0027-4565-8422-74e11905e1ec"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ddf30bed-88dd-4d99-9fd9-9be90ffdd167

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddf30bed-88dd-4d99-9fd9-9be90ffdd167
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ddf30bed-88dd-4d99-9fd9-9be90ffdd167
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-8203627f-3bb0-47a5-bf35-1e141531e53b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8203627f-3bb0-47a5-bf35-1e141531e53b
Content-Type: application/json

--- request body ---
{"handle":"qa-43c6fd46ed26","password":"****"}

--- response: 401 in 8 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8203627f-3bb0-47a5-bf35-1e141531e53b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8203627f-3bb0-47a5-bf35-1e141531e53b"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a3d9c841-d3e4-4ef0-a838-114e6cf287f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3d9c841-d3e4-4ef0-a838-114e6cf287f8
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a3d9c841-d3e4-4ef0-a838-114e6cf287f8
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

## 16. POST /v1/auth/token

```text
#16 POST http://localhost:7070/v1/auth/token
correlation: qa-487a3bdc-ae0e-47e4-bb7a-0dc2bcbac999

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-487a3bdc-ae0e-47e4-bb7a-0dc2bcbac999
Content-Type: application/json

--- request body ---
{"handle":"qa-8c4854e43d92","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-487a3bdc-ae0e-47e4-bb7a-0dc2bcbac999
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-487a3bdc-ae0e-47e4-bb7a-0dc2bcbac999"}
```

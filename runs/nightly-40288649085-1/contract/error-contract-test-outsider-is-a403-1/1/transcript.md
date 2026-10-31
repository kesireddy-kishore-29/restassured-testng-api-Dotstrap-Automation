# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[1]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-ce91a548-a0a5-426e-bfc0-f8fe18d0e99f` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-3865cf99-0104-4420-84ea-9fd0935c527d` |
| 3 | `POST /v1/accounts` | 201 | 26 | `qa-52e3775f-e07b-4a5f-ae7d-c0abdc96e66c` |
| 4 | `POST /v1/auth/token` | 200 | 14 | `qa-4bc9d527-0d25-4898-a8a5-d1cb4e10fcf0` |
| 5 | `POST /v1/conversations` | 201 | 9 | `qa-51ee9deb-0370-456b-b617-edd85ce75daf` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-0043b8fb-c579-46c6-8407-9b509423cdeb` |
| 7 | `GET /v1/conversations/{id}/messages` | 403 | 20 | `qa-3f92d6e7-e111-4b2a-8824-f4e651763e5a` |
| 8 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-91ed5430-88d3-41f4-8c82-3e12ad13b6ea` |
| 9 | `POST /v1/auth/token` | 401 | 21 | `qa-bd7c88c8-b9a9-46e7-affc-2ea037acf44d` |
| 10 | `POST /v1/auth/token` | 200 | 38 | `qa-2e7e31ff-8c04-48f2-b7c9-d0bff48db111` |
| 11 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-3fd762ce-fae1-4622-bb53-598e3a71f222` |
| 12 | `POST /v1/auth/token` | 401 | 33 | `qa-6fda203a-a430-4537-bfb7-20b959d17df2` |
| 13 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-677f8c90-5488-4029-9745-cb8f6d9c5b69` |
| 14 | `POST /v1/auth/token` | 401 | 38 | `qa-5f4137fd-aa0b-48ef-97df-a40269a7ebb9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ce91a548-a0a5-426e-bfc0-f8fe18d0e99f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce91a548-a0a5-426e-bfc0-f8fe18d0e99f
Content-Type: application/json

--- request body ---
{"handle":"qa-8092ecf86b4a","displayName":"QA 8092ecf86b4a","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce91a548-a0a5-426e-bfc0-f8fe18d0e99f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 547
RateLimit-Reset: 9
Location: /v1/accounts/qa-8092ecf86b4a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d4f9a538-baa8-4958-9861-464fed567bf5","handle":"qa-8092ecf86b4a","displayName":"QA 8092ecf86b4a","region":"eu","role":"user","createdAt":"2026-10-26T07:54:46.420707400Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3865cf99-0104-4420-84ea-9fd0935c527d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3865cf99-0104-4420-84ea-9fd0935c527d
Content-Type: application/json

--- request body ---
{"handle":"qa-d4b9ca65643f","displayName":"QA d4b9ca65643f","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-3865cf99-0104-4420-84ea-9fd0935c527d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 540
RateLimit-Reset: 9
Location: /v1/accounts/qa-d4b9ca65643f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8193ae45-0e7f-4f53-83b7-dff8addad7e0","handle":"qa-d4b9ca65643f","displayName":"QA d4b9ca65643f","region":"eu","role":"user","createdAt":"2026-10-26T07:54:46.464976765Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-52e3775f-e07b-4a5f-ae7d-c0abdc96e66c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52e3775f-e07b-4a5f-ae7d-c0abdc96e66c
Content-Type: application/json

--- request body ---
{"handle":"qa-b03dd0d3c33b","displayName":"QA b03dd0d3c33b","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-52e3775f-e07b-4a5f-ae7d-c0abdc96e66c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 536
RateLimit-Reset: 9
Location: /v1/accounts/qa-b03dd0d3c33b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_234d580c-42ee-4c71-8a1f-0e92a1eaafa7","handle":"qa-b03dd0d3c33b","displayName":"QA b03dd0d3c33b","region":"eu","role":"user","createdAt":"2026-10-26T07:54:46.504717530Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-4bc9d527-0d25-4898-a8a5-d1cb4e10fcf0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4bc9d527-0d25-4898-a8a5-d1cb4e10fcf0
Content-Type: application/json

--- request body ---
{"handle":"qa-8092ecf86b4a","password":"****"}

--- response: 200 in 14 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-4bc9d527-0d25-4898-a8a5-d1cb4e10fcf0
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d4f9a538-baa8-4958-9861-464fed567bf5"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-51ee9deb-0370-456b-b617-edd85ce75daf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51ee9deb-0370-456b-b617-edd85ce75daf
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d4b9ca65643f","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-51ee9deb-0370-456b-b617-edd85ce75daf
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
Location: /v1/conversations/cnv_42e2351e-488e-4dfb-bdfb-a1ffec62384d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_42e2351e-488e-4dfb-bdfb-a1ffec62384d","subject":"Error contract","status":"open","region":"eu","participants":["qa-8092ecf86b4a","qa-d4b9ca65643f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:46.567352348Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0043b8fb-c579-46c6-8407-9b509423cdeb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0043b8fb-c579-46c6-8407-9b509423cdeb
Content-Type: application/json

--- request body ---
{"handle":"qa-b03dd0d3c33b","password":"****"}

--- response: 200 in 22 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-0043b8fb-c579-46c6-8407-9b509423cdeb
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_234d580c-42ee-4c71-8a1f-0e92a1eaafa7"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_42e2351e-488e-4dfb-bdfb-a1ffec62384d/messages
correlation: qa-3f92d6e7-e111-4b2a-8824-f4e651763e5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f92d6e7-e111-4b2a-8824-f4e651763e5a
Content-Type: application/json

--- response: 403 in 20 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3f92d6e7-e111-4b2a-8824-f4e651763e5a
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_42e2351e-488e-4dfb-bdfb-a1ffec62384d/messages","correlationId":"qa-3f92d6e7-e111-4b2a-8824-f4e651763e5a"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-91ed5430-88d3-41f4-8c82-3e12ad13b6ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91ed5430-88d3-41f4-8c82-3e12ad13b6ea
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-91ed5430-88d3-41f4-8c82-3e12ad13b6ea
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
correlation: qa-bd7c88c8-b9a9-46e7-affc-2ea037acf44d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd7c88c8-b9a9-46e7-affc-2ea037acf44d
Content-Type: application/json

--- request body ---
{"handle":"qa-b03dd0d3c33b","password":"****"}

--- response: 401 in 21 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bd7c88c8-b9a9-46e7-affc-2ea037acf44d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 513
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bd7c88c8-b9a9-46e7-affc-2ea037acf44d"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-2e7e31ff-8c04-48f2-b7c9-d0bff48db111

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e7e31ff-8c04-48f2-b7c9-d0bff48db111
Content-Type: application/json

--- request body ---
{"handle":"qa-d4b9ca65643f","password":"****"}

--- response: 200 in 38 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e7e31ff-8c04-48f2-b7c9-d0bff48db111
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 506
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8193ae45-0e7f-4f53-83b7-dff8addad7e0"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3fd762ce-fae1-4622-bb53-598e3a71f222

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fd762ce-fae1-4622-bb53-598e3a71f222
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3fd762ce-fae1-4622-bb53-598e3a71f222
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
correlation: qa-6fda203a-a430-4537-bfb7-20b959d17df2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6fda203a-a430-4537-bfb7-20b959d17df2
Content-Type: application/json

--- request body ---
{"handle":"qa-d4b9ca65643f","password":"****"}

--- response: 401 in 33 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6fda203a-a430-4537-bfb7-20b959d17df2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 492
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6fda203a-a430-4537-bfb7-20b959d17df2"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-677f8c90-5488-4029-9745-cb8f6d9c5b69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-677f8c90-5488-4029-9745-cb8f6d9c5b69
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-677f8c90-5488-4029-9745-cb8f6d9c5b69
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-5f4137fd-aa0b-48ef-97df-a40269a7ebb9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f4137fd-aa0b-48ef-97df-a40269a7ebb9
Content-Type: application/json

--- request body ---
{"handle":"qa-8092ecf86b4a","password":"****"}

--- response: 401 in 38 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5f4137fd-aa0b-48ef-97df-a40269a7ebb9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 477
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5f4137fd-aa0b-48ef-97df-a40269a7ebb9"}
```

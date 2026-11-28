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
| 1 | `POST /v1/accounts` | 201 | 447 | `qa-b8a385c6-0c7a-465a-9473-8c464b671ee4` |
| 2 | `POST /v1/accounts` | 201 | 11 | `qa-7f908949-9c74-4734-9eb3-05fc241271d2` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-13cd7574-8818-49c9-9173-5ea5657fc4a5` |
| 4 | `POST /v1/conversations` | 201 | 38 | `qa-264b4e6b-3cbe-4c45-b302-b946e6c358c8` |
| 5 | `GET /v1/conversations/{id}` | 200 | 25 | `qa-0ebf09fa-f634-4d15-a4ad-f8bdb41163a9` |
| 6 | `POST /v1/auth/token` | 200 | 12 | `qa-eeab1605-d771-4d3d-b4c5-1e8659ff04e0` |
| 7 | `GET /v1/conversations/{id}` | 200 | 7 | `qa-8c902702-140e-40a3-8298-6bdd0c02c72b` |
| 8 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-052fd74e-49bb-4222-88b2-24bac433e529` |
| 9 | `POST /v1/auth/token` | 401 | 13 | `qa-32317145-35b9-41d2-80cb-567ebda3811d` |
| 10 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-b4ad8d54-978c-4751-9369-ff7116098e79` |
| 11 | `POST /v1/auth/token` | 401 | 16 | `qa-3091bdeb-f6b1-4a42-b4db-d975aafcfb95` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b8a385c6-0c7a-465a-9473-8c464b671ee4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8a385c6-0c7a-465a-9473-8c464b671ee4
Content-Type: application/json

--- request body ---
{"handle":"qa-138ad9887ca7","displayName":"QA 138ad9887ca7","password":"****","region":"in"}

--- response: 201 in 447 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-b8a385c6-0c7a-465a-9473-8c464b671ee4
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
Location: /v1/accounts/qa-138ad9887ca7
X-Served-Region: in
Content-Length: 181

{"id":"acc_a0a7b673-58fd-4d2a-bcab-31ac9f257884","handle":"qa-138ad9887ca7","displayName":"QA 138ad9887ca7","region":"in","role":"user","createdAt":"2026-11-27T10:59:51.942716672Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7f908949-9c74-4734-9eb3-05fc241271d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f908949-9c74-4734-9eb3-05fc241271d2
Content-Type: application/json

--- request body ---
{"handle":"qa-b17e02e142a8","displayName":"QA b17e02e142a8","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f908949-9c74-4734-9eb3-05fc241271d2
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
Location: /v1/accounts/qa-b17e02e142a8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7676f08e-8f37-4a3f-8d83-11e2fccbad68","handle":"qa-b17e02e142a8","displayName":"QA b17e02e142a8","region":"eu","role":"user","createdAt":"2026-11-27T10:59:52.369590094Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-13cd7574-8818-49c9-9173-5ea5657fc4a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13cd7574-8818-49c9-9173-5ea5657fc4a5
Content-Type: application/json

--- request body ---
{"handle":"qa-138ad9887ca7","password":"****"}

--- response: 200 in 28 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-13cd7574-8818-49c9-9173-5ea5657fc4a5
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a0a7b673-58fd-4d2a-bcab-31ac9f257884"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-264b4e6b-3cbe-4c45-b302-b946e6c358c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-264b4e6b-3cbe-4c45-b302-b946e6c358c8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b17e02e142a8","subject":"Across regions","message":"Namaste"}

--- response: 201 in 38 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-264b4e6b-3cbe-4c45-b302-b946e6c358c8
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
Location: /v1/conversations/cnv_06cb1655-dca2-4a02-860d-0f72dea555a5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_06cb1655-dca2-4a02-860d-0f72dea555a5","subject":"Across regions","status":"open","region":"eu","participants":["qa-138ad9887ca7","qa-b17e02e142a8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:52.492111257Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_06cb1655-dca2-4a02-860d-0f72dea555a5
correlation: qa-0ebf09fa-f634-4d15-a4ad-f8bdb41163a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ebf09fa-f634-4d15-a4ad-f8bdb41163a9
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ebf09fa-f634-4d15-a4ad-f8bdb41163a9
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

{"id":"cnv_06cb1655-dca2-4a02-860d-0f72dea555a5","subject":"Across regions","status":"open","region":"eu","participants":["qa-138ad9887ca7","qa-b17e02e142a8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:52.492111257Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-eeab1605-d771-4d3d-b4c5-1e8659ff04e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eeab1605-d771-4d3d-b4c5-1e8659ff04e0
Content-Type: application/json

--- request body ---
{"handle":"qa-b17e02e142a8","password":"****"}

--- response: 200 in 12 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-eeab1605-d771-4d3d-b4c5-1e8659ff04e0
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7676f08e-8f37-4a3f-8d83-11e2fccbad68"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_06cb1655-dca2-4a02-860d-0f72dea555a5
correlation: qa-8c902702-140e-40a3-8298-6bdd0c02c72b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c902702-140e-40a3-8298-6bdd0c02c72b
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c902702-140e-40a3-8298-6bdd0c02c72b
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

{"id":"cnv_06cb1655-dca2-4a02-860d-0f72dea555a5","subject":"Across regions","status":"open","region":"eu","participants":["qa-138ad9887ca7","qa-b17e02e142a8"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-27T10:59:52.492111257Z"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-052fd74e-49bb-4222-88b2-24bac433e529

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-052fd74e-49bb-4222-88b2-24bac433e529
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-052fd74e-49bb-4222-88b2-24bac433e529
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
correlation: qa-32317145-35b9-41d2-80cb-567ebda3811d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32317145-35b9-41d2-80cb-567ebda3811d
Content-Type: application/json

--- request body ---
{"handle":"qa-b17e02e142a8","password":"****"}

--- response: 401 in 13 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-32317145-35b9-41d2-80cb-567ebda3811d
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-32317145-35b9-41d2-80cb-567ebda3811d"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b4ad8d54-978c-4751-9369-ff7116098e79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4ad8d54-978c-4751-9369-ff7116098e79
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b4ad8d54-978c-4751-9369-ff7116098e79
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
correlation: qa-3091bdeb-f6b1-4a42-b4db-d975aafcfb95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3091bdeb-f6b1-4a42-b4db-d975aafcfb95
Content-Type: application/json

--- request body ---
{"handle":"qa-138ad9887ca7","password":"****"}

--- response: 401 in 16 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3091bdeb-f6b1-4a42-b4db-d975aafcfb95
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3091bdeb-f6b1-4a42-b4db-d975aafcfb95"}
```

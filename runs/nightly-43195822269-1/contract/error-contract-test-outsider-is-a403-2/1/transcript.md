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
| 1 | `POST /v1/accounts` | 201 | 38 | `qa-c85baa06-c6d1-4984-8f44-ed5f81c4e62b` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-ac9c1114-a240-4296-8585-df75655cdfb3` |
| 3 | `POST /v1/accounts` | 201 | 25 | `qa-eb495a46-054e-4f11-8c15-5eb7a4080ee1` |
| 4 | `POST /v1/auth/token` | 200 | 24 | `qa-1d521419-c09d-4345-9491-9e9f98ce279e` |
| 5 | `POST /v1/conversations` | 201 | 29 | `qa-0bf48786-ed10-4fe0-9796-3120beaefae2` |
| 6 | `POST /v1/auth/token` | 200 | 17 | `qa-0d204758-a8bd-4556-9c12-b43c159ef47c` |
| 7 | `POST /v1/conversations/{id}/messages` | 403 | 12 | `qa-b1583b72-33ad-4140-b2ce-0347fdde2298` |
| 8 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-6d7c29ef-f3c2-4bf1-a822-50d76b265732` |
| 9 | `POST /v1/auth/token` | 401 | 21 | `qa-9c34066e-4c4b-40b9-91be-beee9d3ea9d4` |
| 10 | `POST /v1/auth/token` | 200 | 29 | `qa-48cfd51d-f078-401e-a255-5045a9f5e55f` |
| 11 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-3cef3cf1-b796-4da6-8ca8-235268c82394` |
| 12 | `POST /v1/auth/token` | 401 | 7 | `qa-ef95dd03-220b-4b83-ad6d-4b49d30658b3` |
| 13 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-5dc0b3d1-d438-448c-a6d7-32578e32a25f` |
| 14 | `POST /v1/auth/token` | 401 | 15 | `qa-bba7c54f-360d-46b5-a321-65aaf9217298` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c85baa06-c6d1-4984-8f44-ed5f81c4e62b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c85baa06-c6d1-4984-8f44-ed5f81c4e62b
Content-Type: application/json

--- request body ---
{"handle":"qa-f82a76cb0a6b","displayName":"QA f82a76cb0a6b","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-c85baa06-c6d1-4984-8f44-ed5f81c4e62b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 10
Location: /v1/accounts/qa-f82a76cb0a6b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c4bcf267-4158-4419-88d2-4b5824403f27","handle":"qa-f82a76cb0a6b","displayName":"QA f82a76cb0a6b","region":"eu","role":"user","createdAt":"2026-11-12T09:56:30.073879765Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ac9c1114-a240-4296-8585-df75655cdfb3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac9c1114-a240-4296-8585-df75655cdfb3
Content-Type: application/json

--- request body ---
{"handle":"qa-6480fd89954e","displayName":"QA 6480fd89954e","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac9c1114-a240-4296-8585-df75655cdfb3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 550
RateLimit-Reset: 10
Location: /v1/accounts/qa-6480fd89954e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f46eacdd-fef3-4950-b358-7028c7cedebf","handle":"qa-6480fd89954e","displayName":"QA 6480fd89954e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:30.105894496Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-eb495a46-054e-4f11-8c15-5eb7a4080ee1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb495a46-054e-4f11-8c15-5eb7a4080ee1
Content-Type: application/json

--- request body ---
{"handle":"qa-be4323c2dbbf","displayName":"QA be4323c2dbbf","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb495a46-054e-4f11-8c15-5eb7a4080ee1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 544
RateLimit-Reset: 10
Location: /v1/accounts/qa-be4323c2dbbf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9655c69d-4f96-446a-8f1c-7fa38826dc5f","handle":"qa-be4323c2dbbf","displayName":"QA be4323c2dbbf","region":"eu","role":"user","createdAt":"2026-11-12T09:56:30.134105143Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-1d521419-c09d-4345-9491-9e9f98ce279e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d521419-c09d-4345-9491-9e9f98ce279e
Content-Type: application/json

--- request body ---
{"handle":"qa-f82a76cb0a6b","password":"****"}

--- response: 200 in 24 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d521419-c09d-4345-9491-9e9f98ce279e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 536
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c4bcf267-4158-4419-88d2-4b5824403f27"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-0bf48786-ed10-4fe0-9796-3120beaefae2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0bf48786-ed10-4fe0-9796-3120beaefae2
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6480fd89954e","subject":"Error contract","message":"Hi"}

--- response: 201 in 29 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-0bf48786-ed10-4fe0-9796-3120beaefae2
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
Location: /v1/conversations/cnv_5d6102cd-9c45-474c-a0af-0727c88f2747
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5d6102cd-9c45-474c-a0af-0727c88f2747","subject":"Error contract","status":"open","region":"eu","participants":["qa-f82a76cb0a6b","qa-6480fd89954e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:30.207686010Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0d204758-a8bd-4556-9c12-b43c159ef47c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d204758-a8bd-4556-9c12-b43c159ef47c
Content-Type: application/json

--- request body ---
{"handle":"qa-be4323c2dbbf","password":"****"}

--- response: 200 in 17 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d204758-a8bd-4556-9c12-b43c159ef47c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 528
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9655c69d-4f96-446a-8f1c-7fa38826dc5f"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_5d6102cd-9c45-474c-a0af-0727c88f2747/messages
correlation: qa-b1583b72-33ad-4140-b2ce-0347fdde2298

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1583b72-33ad-4140-b2ce-0347fdde2298
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 403 in 12 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b1583b72-33ad-4140-b2ce-0347fdde2298
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_5d6102cd-9c45-474c-a0af-0727c88f2747/messages","correlationId":"qa-b1583b72-33ad-4140-b2ce-0347fdde2298"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6d7c29ef-f3c2-4bf1-a822-50d76b265732

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d7c29ef-f3c2-4bf1-a822-50d76b265732
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6d7c29ef-f3c2-4bf1-a822-50d76b265732
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
correlation: qa-9c34066e-4c4b-40b9-91be-beee9d3ea9d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c34066e-4c4b-40b9-91be-beee9d3ea9d4
Content-Type: application/json

--- request body ---
{"handle":"qa-be4323c2dbbf","password":"****"}

--- response: 401 in 21 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9c34066e-4c4b-40b9-91be-beee9d3ea9d4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 516
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9c34066e-4c4b-40b9-91be-beee9d3ea9d4"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-48cfd51d-f078-401e-a255-5045a9f5e55f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48cfd51d-f078-401e-a255-5045a9f5e55f
Content-Type: application/json

--- request body ---
{"handle":"qa-6480fd89954e","password":"****"}

--- response: 200 in 29 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-48cfd51d-f078-401e-a255-5045a9f5e55f
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f46eacdd-fef3-4950-b358-7028c7cedebf"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3cef3cf1-b796-4da6-8ca8-235268c82394

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3cef3cf1-b796-4da6-8ca8-235268c82394
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3cef3cf1-b796-4da6-8ca8-235268c82394
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
correlation: qa-ef95dd03-220b-4b83-ad6d-4b49d30658b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef95dd03-220b-4b83-ad6d-4b49d30658b3
Content-Type: application/json

--- request body ---
{"handle":"qa-6480fd89954e","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ef95dd03-220b-4b83-ad6d-4b49d30658b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 499
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ef95dd03-220b-4b83-ad6d-4b49d30658b3"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5dc0b3d1-d438-448c-a6d7-32578e32a25f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5dc0b3d1-d438-448c-a6d7-32578e32a25f
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5dc0b3d1-d438-448c-a6d7-32578e32a25f
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
correlation: qa-bba7c54f-360d-46b5-a321-65aaf9217298

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bba7c54f-360d-46b5-a321-65aaf9217298
Content-Type: application/json

--- request body ---
{"handle":"qa-f82a76cb0a6b","password":"****"}

--- response: 401 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bba7c54f-360d-46b5-a321-65aaf9217298
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 485
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bba7c54f-360d-46b5-a321-65aaf9217298"}
```

# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[4]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-c42b028d-c65c-4e7e-84bc-9d1673995d95` |
| 2 | `POST /v1/accounts` | 201 | 15 | `qa-cefd48e5-7601-4000-aa9c-efcd6cfcf7e8` |
| 3 | `POST /v1/accounts` | 201 | 28 | `qa-240c51a8-45a7-4061-b0ff-9f054e126a13` |
| 4 | `POST /v1/auth/token` | 200 | 47 | `qa-4f353526-601d-4de0-9be7-641884ec6479` |
| 5 | `POST /v1/conversations` | 201 | 12 | `qa-37707877-af46-4a86-b02a-5f169bdc56a7` |
| 6 | `POST /v1/auth/token` | 200 | 45 | `qa-a1688123-9418-4296-9ab4-13b9247b7486` |
| 7 | `POST /v1/conversations/{id}/close` | 403 | 14 | `qa-75d76799-b3bf-47d7-ba76-58c6f8dc4ba1` |
| 8 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-20d6ab94-7d4b-4685-a3d1-0256b288e3d5` |
| 9 | `POST /v1/auth/token` | 401 | 14 | `qa-fbc294a0-de33-4bcf-9901-95be3f54cea9` |
| 10 | `POST /v1/auth/token` | 200 | 24 | `qa-d38c2097-5c79-4915-a931-884795b0143c` |
| 11 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-345761cb-0c5e-4225-b5a5-9c4e4810133b` |
| 12 | `POST /v1/auth/token` | 401 | 10 | `qa-5dd3a229-f103-4c8c-87d7-e6a794fa8787` |
| 13 | `DELETE /v1/accounts/me` | 204 | 34 | `qa-17cb9a0c-3fcb-49c0-98f3-d7c7704857e4` |
| 14 | `POST /v1/auth/token` | 401 | 20 | `qa-6f160a23-300f-4a3e-8050-5512f30e1ec4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c42b028d-c65c-4e7e-84bc-9d1673995d95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c42b028d-c65c-4e7e-84bc-9d1673995d95
Content-Type: application/json

--- request body ---
{"handle":"qa-33a355fc4f3e","displayName":"QA 33a355fc4f3e","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-c42b028d-c65c-4e7e-84bc-9d1673995d95
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 472
RateLimit-Reset: 8
Location: /v1/accounts/qa-33a355fc4f3e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cd1004e3-8744-4ccd-ae52-4ad2d307c8b6","handle":"qa-33a355fc4f3e","displayName":"QA 33a355fc4f3e","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.044429645Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-cefd48e5-7601-4000-aa9c-efcd6cfcf7e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cefd48e5-7601-4000-aa9c-efcd6cfcf7e8
Content-Type: application/json

--- request body ---
{"handle":"qa-699a8d928796","displayName":"QA 699a8d928796","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-cefd48e5-7601-4000-aa9c-efcd6cfcf7e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 461
RateLimit-Reset: 8
Location: /v1/accounts/qa-699a8d928796
X-Served-Region: eu
Content-Length: 181

{"id":"acc_377e5df8-397e-4eed-b9fd-3399ad2437a4","handle":"qa-699a8d928796","displayName":"QA 699a8d928796","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.089893509Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-240c51a8-45a7-4061-b0ff-9f054e126a13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-240c51a8-45a7-4061-b0ff-9f054e126a13
Content-Type: application/json

--- request body ---
{"handle":"qa-a2f07221c846","displayName":"QA a2f07221c846","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-240c51a8-45a7-4061-b0ff-9f054e126a13
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 454
RateLimit-Reset: 8
Location: /v1/accounts/qa-a2f07221c846
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3a60384b-7330-48b0-8899-7f6f2c487c03","handle":"qa-a2f07221c846","displayName":"QA a2f07221c846","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.131237387Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-4f353526-601d-4de0-9be7-641884ec6479

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f353526-601d-4de0-9be7-641884ec6479
Content-Type: application/json

--- request body ---
{"handle":"qa-33a355fc4f3e","password":"****"}

--- response: 200 in 47 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-4f353526-601d-4de0-9be7-641884ec6479
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 448
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cd1004e3-8744-4ccd-ae52-4ad2d307c8b6"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-37707877-af46-4a86-b02a-5f169bdc56a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37707877-af46-4a86-b02a-5f169bdc56a7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-699a8d928796","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-37707877-af46-4a86-b02a-5f169bdc56a7
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
Location: /v1/conversations/cnv_4c1f306b-0d85-4969-ba66-ba2fffb1191d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4c1f306b-0d85-4969-ba66-ba2fffb1191d","subject":"Error contract","status":"open","region":"eu","participants":["qa-33a355fc4f3e","qa-699a8d928796"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:07.214610034Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a1688123-9418-4296-9ab4-13b9247b7486

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1688123-9418-4296-9ab4-13b9247b7486
Content-Type: application/json

--- request body ---
{"handle":"qa-a2f07221c846","password":"****"}

--- response: 200 in 45 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-a1688123-9418-4296-9ab4-13b9247b7486
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 445
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3a60384b-7330-48b0-8899-7f6f2c487c03"}
```

## 7. POST /v1/conversations/{id}/close

```text
#7 POST http://localhost:7070/v1/conversations/cnv_4c1f306b-0d85-4969-ba66-ba2fffb1191d/close
correlation: qa-75d76799-b3bf-47d7-ba76-58c6f8dc4ba1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75d76799-b3bf-47d7-ba76-58c6f8dc4ba1
Content-Type: application/json

--- response: 403 in 14 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-75d76799-b3bf-47d7-ba76-58c6f8dc4ba1
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
Content-Length: 291

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_4c1f306b-0d85-4969-ba66-ba2fffb1191d/close","correlationId":"qa-75d76799-b3bf-47d7-ba76-58c6f8dc4ba1"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-20d6ab94-7d4b-4685-a3d1-0256b288e3d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20d6ab94-7d4b-4685-a3d1-0256b288e3d5
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-20d6ab94-7d4b-4685-a3d1-0256b288e3d5
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
correlation: qa-fbc294a0-de33-4bcf-9901-95be3f54cea9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fbc294a0-de33-4bcf-9901-95be3f54cea9
Content-Type: application/json

--- request body ---
{"handle":"qa-a2f07221c846","password":"****"}

--- response: 401 in 14 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fbc294a0-de33-4bcf-9901-95be3f54cea9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 426
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fbc294a0-de33-4bcf-9901-95be3f54cea9"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-d38c2097-5c79-4915-a931-884795b0143c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d38c2097-5c79-4915-a931-884795b0143c
Content-Type: application/json

--- request body ---
{"handle":"qa-699a8d928796","password":"****"}

--- response: 200 in 24 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-d38c2097-5c79-4915-a931-884795b0143c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 419
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_377e5df8-397e-4eed-b9fd-3399ad2437a4"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-345761cb-0c5e-4225-b5a5-9c4e4810133b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-345761cb-0c5e-4225-b5a5-9c4e4810133b
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-345761cb-0c5e-4225-b5a5-9c4e4810133b
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
correlation: qa-5dd3a229-f103-4c8c-87d7-e6a794fa8787

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5dd3a229-f103-4c8c-87d7-e6a794fa8787
Content-Type: application/json

--- request body ---
{"handle":"qa-699a8d928796","password":"****"}

--- response: 401 in 10 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5dd3a229-f103-4c8c-87d7-e6a794fa8787
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 407
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5dd3a229-f103-4c8c-87d7-e6a794fa8787"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-17cb9a0c-3fcb-49c0-98f3-d7c7704857e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17cb9a0c-3fcb-49c0-98f3-d7c7704857e4
Content-Type: application/json

--- response: 204 in 34 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-17cb9a0c-3fcb-49c0-98f3-d7c7704857e4
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
correlation: qa-6f160a23-300f-4a3e-8050-5512f30e1ec4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f160a23-300f-4a3e-8050-5512f30e1ec4
Content-Type: application/json

--- request body ---
{"handle":"qa-33a355fc4f3e","password":"****"}

--- response: 401 in 20 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6f160a23-300f-4a3e-8050-5512f30e1ec4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 394
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6f160a23-300f-4a3e-8050-5512f30e1ec4"}
```

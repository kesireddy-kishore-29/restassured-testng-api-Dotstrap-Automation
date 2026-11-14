# Transcript: Past its rate limit, a token gets a 429 problem from every operation

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#pastTheLimitEveryOperationIsA429` |
| Features | FEAT-RATE-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 104 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-9aba6c12-08a5-44e2-ab30-d2ef534822b6` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-6287e488-55fd-4f39-9ceb-aeb4bd38230c` |
| 3 | `POST /v1/auth/token` | 200 | 43 | `qa-f0793d6f-7345-4144-87d3-09e442037d09` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-1122b935-b8a3-4261-b72e-abd573a82a5e` |
| 5 | `GET /v1/accounts/me` | 200 | 12 | `qa-fed155cc-6154-4741-8b3d-0d93cc24577d` |
| 6 | `GET /v1/accounts/me` | 200 | 17 | `qa-601dca3c-ea28-4a07-945f-1547f7ffa693` |
| 7 | `GET /v1/accounts/me` | 200 | 8 | `qa-b6097761-9b8d-4ce4-8829-810d6337f4a7` |
| 8 | `GET /v1/accounts/me` | 200 | 22 | `qa-a5ec75b2-1206-43c7-a147-47d84060be49` |
| 9 | `GET /v1/accounts/me` | 200 | 12 | `qa-432df6aa-0c59-490a-a5b4-5e75555c4d72` |
| 10 | `GET /v1/accounts/me` | 200 | 7 | `qa-072f4076-0893-43c8-8789-cc03ca8cea7b` |
| 11 | `GET /v1/accounts/me` | 200 | 20 | `qa-b9e6130a-08ea-4a33-b0d8-b29011e35afe` |
| 12 | `GET /v1/accounts/me` | 200 | 17 | `qa-e9f5f23d-47bc-4003-a115-c0738c7136bf` |
| 13 | `GET /v1/accounts/me` | 200 | 16 | `qa-355a8ca2-9f0f-4b4b-ad41-9ffab30b2768` |
| 14 | `GET /v1/accounts/me` | 200 | 30 | `qa-44c0a756-301c-4d94-8072-1aa50a3a714a` |
| 15 | `GET /v1/accounts/me` | 200 | 19 | `qa-dc6902e5-57d0-46a0-a502-fac8cd5fb8a7` |
| 16 | `GET /v1/accounts/me` | 200 | 12 | `qa-0ac71571-3c07-461b-94fa-818eae21828d` |
| 17 | `GET /v1/accounts/me` | 200 | 9 | `qa-b103f260-0754-4140-9cec-0a8cd3f7e028` |
| 18 | `GET /v1/accounts/me` | 200 | 21 | `qa-ec2a3f43-9157-4016-926c-df2d2bf3ab83` |
| 19 | `GET /v1/accounts/me` | 200 | 10 | `qa-6f4ae085-f3e9-4736-b522-2f6d31ad5c50` |
| 20 | `GET /v1/accounts/me` | 200 | 15 | `qa-f9fb5b18-bd0f-45c3-ac9b-d3a71d161ddc` |
| 21 | `GET /v1/accounts/me` | 200 | 16 | `qa-9540e9ea-c371-454c-ad8b-11801aa41292` |
| 22 | `GET /v1/accounts/me` | 200 | 66 | `qa-f4cb32e6-1d2d-4ad0-9958-ab7c3d53866d` |
| 23 | `GET /v1/accounts/me` | 200 | 9 | `qa-0440ace4-65ef-4814-a3ce-8534dd3df991` |
| 24 | `GET /v1/accounts/me` | 200 | 13 | `qa-41fe3f74-23ed-4d50-8849-0e1c4ff210e1` |
| 25 | `GET /v1/accounts/me` | 200 | 14 | `qa-35df6508-acb6-471e-91fc-67496fa3f9a7` |
| 26 | `GET /v1/accounts/me` | 200 | 13 | `qa-59850aa4-1731-49cf-b46a-94b96470d752` |
| 27 | `GET /v1/accounts/me` | 200 | 16 | `qa-b16ab7f7-6c6e-498d-839a-088071ddd5ad` |
| 28 | `GET /v1/accounts/me` | 200 | 4 | `qa-fd49bd98-af3c-4126-be30-f31d4d3c4065` |
| 29 | `GET /v1/accounts/me` | 200 | 15 | `qa-b2ecd329-e344-4f2b-89df-c0bb84d1e7fc` |
| 30 | `GET /v1/accounts/me` | 200 | 3 | `qa-fec6f448-8178-4a30-a30c-e6e6b737996b` |
| 31 | `GET /v1/accounts/me` | 200 | 12 | `qa-7a86e36d-d148-41e1-97a8-42bcd012880e` |
| 32 | `GET /v1/accounts/me` | 200 | 21 | `qa-fdbb829b-e8f0-4be4-8a4d-12b584216ac1` |
| 33 | `GET /v1/accounts/me` | 200 | 18 | `qa-e54c7454-be14-4956-b434-7c3bdd875679` |
| 34 | `GET /v1/accounts/me` | 200 | 9 | `qa-358b0855-2203-4fff-a034-11f837697973` |
| 35 | `GET /v1/accounts/me` | 200 | 8 | `qa-6a5510c8-7f69-4351-8f87-f935cad8f823` |
| 36 | `GET /v1/accounts/me` | 200 | 10 | `qa-6c6c574d-c1d3-48e5-9e7e-5ca1ade5f000` |
| 37 | `GET /v1/accounts/me` | 200 | 5 | `qa-27384fba-8ccd-45ba-a416-99a8f049c116` |
| 38 | `GET /v1/accounts/me` | 200 | 15 | `qa-a157ee90-b21c-463a-a9a6-1fd9ce61cab9` |
| 39 | `GET /v1/accounts/me` | 200 | 4 | `qa-b87e74d5-b860-4f12-978d-c40f3d9cae2b` |
| 40 | `GET /v1/accounts/me` | 200 | 8 | `qa-8b52043f-ff92-45f8-a6fc-635bd15f7f11` |
| 41 | `GET /v1/accounts/me` | 200 | 9 | `qa-d0a76afe-85d6-4ae5-b14f-145742b77f6b` |
| 42 | `GET /v1/accounts/me` | 200 | 10 | `qa-a633cbfc-7763-49a3-884e-190f250e89aa` |
| 43 | `GET /v1/accounts/me` | 200 | 11 | `qa-a70a758a-987f-4276-909e-4cd7d259745b` |
| 44 | `GET /v1/accounts/me` | 200 | 10 | `qa-bdde8711-7c08-4005-b642-e4769a9cb098` |
| 45 | `GET /v1/accounts/me` | 200 | 10 | `qa-fbfb0076-71e8-4e4e-9d6d-51ee5150d714` |
| 46 | `GET /v1/accounts/me` | 200 | 7 | `qa-2b92370e-1012-4e03-96c7-4c9bb57593e1` |
| 47 | `GET /v1/accounts/me` | 200 | 21 | `qa-24007e1b-5bcd-4d14-91b7-51b05fc5366f` |
| 48 | `GET /v1/accounts/me` | 200 | 15 | `qa-50890b34-b324-48fe-be63-c603b7f73f09` |
| 49 | `GET /v1/accounts/me` | 200 | 9 | `qa-d5211229-f100-40e1-ab38-3028cf3f27de` |
| 50 | `GET /v1/accounts/me` | 200 | 7 | `qa-b6fbb35a-7a20-4aa6-b8d7-9415dc4ccf18` |
| 51 | `GET /v1/accounts/me` | 200 | 7 | `qa-d088016c-5578-403c-a359-d86654544b6c` |
| 52 | `GET /v1/accounts/me` | 200 | 1 | `qa-5a021d92-be74-4f97-bdf3-6c7b3eb63e3e` |
| 53 | `GET /v1/accounts/me` | 200 | 9 | `qa-10df4aca-98a3-4680-a8db-ae1cac1b05bc` |
| 54 | `GET /v1/accounts/me` | 200 | 11 | `qa-07a78c6f-934c-4fbc-9e44-4aef15e8443c` |
| 55 | `GET /v1/accounts/me` | 200 | 10 | `qa-7f8c26e5-21d8-4511-8582-4144755ce4ad` |
| 56 | `GET /v1/accounts/me` | 200 | 5 | `qa-05f00c88-b2f0-4976-931d-e7ff2d50ae02` |
| 57 | `GET /v1/accounts/me` | 200 | 13 | `qa-2db3b705-8efb-4b49-9974-8e854fbc43b6` |
| 58 | `GET /v1/accounts/me` | 200 | 7 | `qa-a6a6f706-f490-4b4e-88fc-05c521ff827a` |
| 59 | `GET /v1/accounts/me` | 200 | 11 | `qa-bafa5f25-7204-492a-a7bd-4c1438fe48f0` |
| 60 | `GET /v1/accounts/me` | 200 | 6 | `qa-7102ea92-a309-4f02-a625-fafb3ed27b45` |
| 61 | `GET /v1/accounts/me` | 200 | 6 | `qa-0838c10f-3f76-47f7-8ef9-a0a04f8411b1` |
| 62 | `GET /v1/accounts/me` | 200 | 2 | `qa-77ecbca2-a5d2-45f6-bb43-634bbe240c5f` |
| 63 | `GET /v1/accounts/me` | 200 | 3 | `qa-d7e54fa2-2832-48a5-ab9a-903aa4bfaf9a` |
| 64 | `GET /v1/accounts/me` | 429 | 3 | `qa-b8b11e16-eb50-40f7-b224-7492e2aa6746` |
| 65 | `POST /v1/auth/token` | 429 | 3 | `qa-fd467b02-304e-4df2-a834-7b7f236ab53b` |
| 66 | `POST /v1/accounts` | 429 | 5 | `qa-b6f40db6-ffd9-4ef7-900f-f47a35a4a295` |
| 67 | `GET /v1/accounts/me` | 429 | 7 | `qa-439c3bbd-e96a-4a66-8d3d-605f506417ce` |
| 68 | `PATCH /v1/accounts/me` | 429 | 5 | `qa-a6abcacb-49b4-4453-8cce-5e7d61727b92` |
| 69 | `DELETE /v1/accounts/me` | 429 | 4 | `qa-84e8fd0a-d92e-4ed7-96df-5540b20574e8` |
| 70 | `GET /v1/accounts/{handle}` | 429 | 5 | `qa-cfadfa70-715b-46c5-b855-2294ce1c2933` |
| 71 | `POST /v1/conversations` | 429 | 4 | `qa-b0d5036a-14d3-4caf-ad90-b717b7ac123c` |
| 72 | `GET /v1/conversations` | 429 | 3 | `qa-77333c28-f702-4a87-8f4f-1a8e2ba68b00` |
| 73 | `GET /v1/conversations/{id}` | 429 | 4 | `qa-71ded565-1903-403e-a756-039914df49f1` |
| 74 | `GET /v1/conversations/{id}/messages` | 429 | 3 | `qa-67254b56-3132-4cae-98a3-a4397a62cfcf` |
| 75 | `POST /v1/conversations/{id}/messages` | 429 | 3 | `qa-23b448ed-3aa3-406e-a122-d95ac84f1b95` |
| 76 | `POST /v1/conversations/{id}/read` | 429 | 4 | `qa-f6f95616-6264-4310-b7b9-694fe371638b` |
| 77 | `POST /v1/conversations/{id}/close` | 429 | 3 | `qa-e9932736-8822-4998-8802-26f1bc57acec` |
| 78 | `GET /v1/credits/balance` | 429 | 3 | `qa-2d41b818-a5fb-445d-ab78-3181672a5ca5` |
| 79 | `GET /v1/credits/ledger` | 429 | 3 | `qa-9b78f4d2-6edc-4aa0-90b2-2d707a4efea2` |
| 80 | `POST /v1/credits/purchases` | 429 | 6 | `qa-7b787934-d8e4-4146-afc5-3a8216f74b68` |
| 81 | `GET /v1/admin/stats` | 429 | 3 | `qa-f0d3a44e-6e88-4dd5-ae20-716800c2aa2a` |
| 82 | `GET /v1/accounts/me` | 429 | 3 | `qa-c5ba6ad4-49b2-40a0-b98f-fcebc3b61dc2` |
| 83 | `GET /v1/accounts/me` | 429 | 3 | `qa-428f8c45-98b0-4c81-a092-1930981a15f7` |
| 84 | `GET /v1/accounts/me` | 429 | 2 | `qa-f97a22b4-9801-4d0e-92ee-d9b74bcc0900` |
| 85 | `GET /v1/accounts/me` | 429 | 4 | `qa-a7c796a8-9795-44f2-bdff-4eeb1117565d` |
| 86 | `GET /v1/accounts/me` | 429 | 3 | `qa-95425a13-a9b0-48cf-801a-9e5c6a670d7c` |
| 87 | `GET /v1/accounts/me` | 429 | 3 | `qa-79298389-ac5f-4b8f-baff-5e35540537d3` |
| 88 | `GET /v1/accounts/me` | 429 | 3 | `qa-a25ec2f4-b1e0-4e8a-bda6-17e44abb6719` |
| 89 | `GET /v1/accounts/me` | 429 | 3 | `qa-2ccbd057-cea5-4c4f-85f1-6973bce23361` |
| 90 | `GET /v1/accounts/me` | 429 | 2 | `qa-666bfd5a-dba6-4c23-b3d1-6b52069bda63` |
| 91 | `GET /v1/accounts/me` | 429 | 3 | `qa-7355a00d-abae-4a20-a83d-5644acb777ae` |
| 92 | `GET /v1/accounts/me` | 429 | 3 | `qa-62be7701-6532-4337-813c-86f4b08e4d89` |
| 93 | `GET /v1/accounts/me` | 429 | 3 | `qa-0a49b464-f6b8-4c05-bdc2-66788d022860` |
| 94 | `GET /v1/accounts/me` | 429 | 4 | `qa-93446afd-18d6-4d12-be7d-c509d2780bea` |
| 95 | `GET /v1/accounts/me` | 429 | 3 | `qa-09a6721f-d7bc-49c0-a0da-63dfded3a502` |
| 96 | `GET /v1/accounts/me` | 429 | 4 | `qa-fc57cb9b-ee2e-43a6-a98a-6961c15191e4` |
| 97 | `GET /v1/accounts/me` | 429 | 3 | `qa-04e25293-0966-407b-95ad-82465a483ddf` |
| 98 | `GET /v1/accounts/me` | 429 | 3 | `qa-c814e7e6-9318-4d97-a816-1e878f94fa33` |
| 99 | `GET /v1/accounts/me` | 200 | 3 | `qa-6a3065b1-ffb2-4a41-b818-c29b63f321b7` |
| 100 | `POST /v1/auth/token` | 200 | 4 | `qa-86f67d2f-610a-4b45-b5e2-95034e18e54b` |
| 101 | `DELETE /v1/accounts/me` | 204 | 1 | `qa-85667c26-ea89-4b2b-baac-63a18a2cad3e` |
| 102 | `POST /v1/auth/token` | 401 | 2 | `qa-34babeb6-23fe-4c73-b678-a2acd2ce7f4d` |
| 103 | `DELETE /v1/accounts/me` | 204 | 1 | `qa-793281cb-e3e0-4e95-bcb0-b8edef2296e3` |
| 104 | `POST /v1/auth/token` | 401 | 1 | `qa-3765092f-df11-4ee6-96c3-75d212636f89` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9aba6c12-08a5-44e2-ab30-d2ef534822b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9aba6c12-08a5-44e2-ab30-d2ef534822b6
Content-Type: application/json

--- request body ---
{"handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-9aba6c12-08a5-44e2-ab30-d2ef534822b6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 438
RateLimit-Reset: 9
Location: /v1/accounts/qa-842b9d07e46d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6287e488-55fd-4f39-9ceb-aeb4bd38230c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6287e488-55fd-4f39-9ceb-aeb4bd38230c
Content-Type: application/json

--- request body ---
{"handle":"qa-2006f300bf74","displayName":"QA 2006f300bf74","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-6287e488-55fd-4f39-9ceb-aeb4bd38230c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 434
RateLimit-Reset: 9
Location: /v1/accounts/qa-2006f300bf74
X-Served-Region: eu
Content-Length: 181

{"id":"acc_295136ab-46f6-4653-b6ef-a807c4eacb55","handle":"qa-2006f300bf74","displayName":"QA 2006f300bf74","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.910697967Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f0793d6f-7345-4144-87d3-09e442037d09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0793d6f-7345-4144-87d3-09e442037d09
Content-Type: application/json

--- request body ---
{"handle":"qa-842b9d07e46d","password":"****"}

--- response: 200 in 43 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0793d6f-7345-4144-87d3-09e442037d09
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 423
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1122b935-b8a3-4261-b72e-abd573a82a5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1122b935-b8a3-4261-b72e-abd573a82a5e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2006f300bf74","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-1122b935-b8a3-4261-b72e-abd573a82a5e
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
Location: /v1/conversations/cnv_f4a526fe-8d39-4deb-951e-6870ee28caf4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f4a526fe-8d39-4deb-951e-6870ee28caf4","subject":"Error contract","status":"open","region":"eu","participants":["qa-842b9d07e46d","qa-2006f300bf74"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:02.990193862Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-fed155cc-6154-4741-8b3d-0d93cc24577d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fed155cc-6154-4741-8b3d-0d93cc24577d
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-fed155cc-6154-4741-8b3d-0d93cc24577d
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
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-601dca3c-ea28-4a07-945f-1547f7ffa693

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-601dca3c-ea28-4a07-945f-1547f7ffa693
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-601dca3c-ea28-4a07-945f-1547f7ffa693
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
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-b6097761-9b8d-4ce4-8829-810d6337f4a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6097761-9b8d-4ce4-8829-810d6337f4a7
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b6097761-9b8d-4ce4-8829-810d6337f4a7
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
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-a5ec75b2-1206-43c7-a147-47d84060be49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5ec75b2-1206-43c7-a147-47d84060be49
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-a5ec75b2-1206-43c7-a147-47d84060be49
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-432df6aa-0c59-490a-a5b4-5e75555c4d72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-432df6aa-0c59-490a-a5b4-5e75555c4d72
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-432df6aa-0c59-490a-a5b4-5e75555c4d72
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-072f4076-0893-43c8-8789-cc03ca8cea7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-072f4076-0893-43c8-8789-cc03ca8cea7b
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-072f4076-0893-43c8-8789-cc03ca8cea7b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-b9e6130a-08ea-4a33-b0d8-b29011e35afe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9e6130a-08ea-4a33-b0d8-b29011e35afe
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9e6130a-08ea-4a33-b0d8-b29011e35afe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-e9f5f23d-47bc-4003-a115-c0738c7136bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9f5f23d-47bc-4003-a115-c0738c7136bf
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9f5f23d-47bc-4003-a115-c0738c7136bf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-355a8ca2-9f0f-4b4b-ad41-9ffab30b2768

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-355a8ca2-9f0f-4b4b-ad41-9ffab30b2768
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-355a8ca2-9f0f-4b4b-ad41-9ffab30b2768
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-44c0a756-301c-4d94-8072-1aa50a3a714a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44c0a756-301c-4d94-8072-1aa50a3a714a
Content-Type: application/json

--- response: 200 in 30 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-44c0a756-301c-4d94-8072-1aa50a3a714a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-dc6902e5-57d0-46a0-a502-fac8cd5fb8a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc6902e5-57d0-46a0-a502-fac8cd5fb8a7
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc6902e5-57d0-46a0-a502-fac8cd5fb8a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 48
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-0ac71571-3c07-461b-94fa-818eae21828d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ac71571-3c07-461b-94fa-818eae21828d
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ac71571-3c07-461b-94fa-818eae21828d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 47
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-b103f260-0754-4140-9cec-0a8cd3f7e028

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b103f260-0754-4140-9cec-0a8cd3f7e028
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b103f260-0754-4140-9cec-0a8cd3f7e028
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 46
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-ec2a3f43-9157-4016-926c-df2d2bf3ab83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec2a3f43-9157-4016-926c-df2d2bf3ab83
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec2a3f43-9157-4016-926c-df2d2bf3ab83
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 45
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-6f4ae085-f3e9-4736-b522-2f6d31ad5c50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f4ae085-f3e9-4736-b522-2f6d31ad5c50
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f4ae085-f3e9-4736-b522-2f6d31ad5c50
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 44
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-f9fb5b18-bd0f-45c3-ac9b-d3a71d161ddc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9fb5b18-bd0f-45c3-ac9b-d3a71d161ddc
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9fb5b18-bd0f-45c3-ac9b-d3a71d161ddc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 43
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-9540e9ea-c371-454c-ad8b-11801aa41292

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9540e9ea-c371-454c-ad8b-11801aa41292
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-9540e9ea-c371-454c-ad8b-11801aa41292
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 42
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-f4cb32e6-1d2d-4ad0-9958-ab7c3d53866d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4cb32e6-1d2d-4ad0-9958-ab7c3d53866d
Content-Type: application/json

--- response: 200 in 66 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4cb32e6-1d2d-4ad0-9958-ab7c3d53866d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 41
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-0440ace4-65ef-4814-a3ce-8534dd3df991

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0440ace4-65ef-4814-a3ce-8534dd3df991
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-0440ace4-65ef-4814-a3ce-8534dd3df991
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 40
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-41fe3f74-23ed-4d50-8849-0e1c4ff210e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41fe3f74-23ed-4d50-8849-0e1c4ff210e1
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-41fe3f74-23ed-4d50-8849-0e1c4ff210e1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 39
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-35df6508-acb6-471e-91fc-67496fa3f9a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35df6508-acb6-471e-91fc-67496fa3f9a7
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-35df6508-acb6-471e-91fc-67496fa3f9a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 38
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-59850aa4-1731-49cf-b46a-94b96470d752

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59850aa4-1731-49cf-b46a-94b96470d752
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-59850aa4-1731-49cf-b46a-94b96470d752
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 37
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-b16ab7f7-6c6e-498d-839a-088071ddd5ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b16ab7f7-6c6e-498d-839a-088071ddd5ad
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b16ab7f7-6c6e-498d-839a-088071ddd5ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 36
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-fd49bd98-af3c-4126-be30-f31d4d3c4065

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd49bd98-af3c-4126-be30-f31d4d3c4065
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd49bd98-af3c-4126-be30-f31d4d3c4065
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 35
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-b2ecd329-e344-4f2b-89df-c0bb84d1e7fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2ecd329-e344-4f2b-89df-c0bb84d1e7fc
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2ecd329-e344-4f2b-89df-c0bb84d1e7fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 34
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-fec6f448-8178-4a30-a30c-e6e6b737996b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fec6f448-8178-4a30-a30c-e6e6b737996b
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-fec6f448-8178-4a30-a30c-e6e6b737996b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 33
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-7a86e36d-d148-41e1-97a8-42bcd012880e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a86e36d-d148-41e1-97a8-42bcd012880e
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a86e36d-d148-41e1-97a8-42bcd012880e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 32
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-fdbb829b-e8f0-4be4-8a4d-12b584216ac1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fdbb829b-e8f0-4be4-8a4d-12b584216ac1
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-fdbb829b-e8f0-4be4-8a4d-12b584216ac1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 31
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-e54c7454-be14-4956-b434-7c3bdd875679

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e54c7454-be14-4956-b434-7c3bdd875679
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e54c7454-be14-4956-b434-7c3bdd875679
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 30
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-358b0855-2203-4fff-a034-11f837697973

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-358b0855-2203-4fff-a034-11f837697973
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-358b0855-2203-4fff-a034-11f837697973
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 29
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-6a5510c8-7f69-4351-8f87-f935cad8f823

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a5510c8-7f69-4351-8f87-f935cad8f823
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a5510c8-7f69-4351-8f87-f935cad8f823
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 28
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-6c6c574d-c1d3-48e5-9e7e-5ca1ade5f000

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c6c574d-c1d3-48e5-9e7e-5ca1ade5f000
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c6c574d-c1d3-48e5-9e7e-5ca1ade5f000
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 27
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-27384fba-8ccd-45ba-a416-99a8f049c116

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27384fba-8ccd-45ba-a416-99a8f049c116
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-27384fba-8ccd-45ba-a416-99a8f049c116
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 26
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-a157ee90-b21c-463a-a9a6-1fd9ce61cab9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a157ee90-b21c-463a-a9a6-1fd9ce61cab9
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-a157ee90-b21c-463a-a9a6-1fd9ce61cab9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 25
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-b87e74d5-b860-4f12-978d-c40f3d9cae2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b87e74d5-b860-4f12-978d-c40f3d9cae2b
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b87e74d5-b860-4f12-978d-c40f3d9cae2b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 24
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-8b52043f-ff92-45f8-a6fc-635bd15f7f11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b52043f-ff92-45f8-a6fc-635bd15f7f11
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b52043f-ff92-45f8-a6fc-635bd15f7f11
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 23
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-d0a76afe-85d6-4ae5-b14f-145742b77f6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0a76afe-85d6-4ae5-b14f-145742b77f6b
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0a76afe-85d6-4ae5-b14f-145742b77f6b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 22
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-a633cbfc-7763-49a3-884e-190f250e89aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a633cbfc-7763-49a3-884e-190f250e89aa
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-a633cbfc-7763-49a3-884e-190f250e89aa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 21
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-a70a758a-987f-4276-909e-4cd7d259745b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a70a758a-987f-4276-909e-4cd7d259745b
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-a70a758a-987f-4276-909e-4cd7d259745b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 20
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-bdde8711-7c08-4005-b642-e4769a9cb098

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bdde8711-7c08-4005-b642-e4769a9cb098
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-bdde8711-7c08-4005-b642-e4769a9cb098
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 19
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-fbfb0076-71e8-4e4e-9d6d-51ee5150d714

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fbfb0076-71e8-4e4e-9d6d-51ee5150d714
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-fbfb0076-71e8-4e4e-9d6d-51ee5150d714
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 18
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-2b92370e-1012-4e03-96c7-4c9bb57593e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b92370e-1012-4e03-96c7-4c9bb57593e1
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b92370e-1012-4e03-96c7-4c9bb57593e1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 17
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-24007e1b-5bcd-4d14-91b7-51b05fc5366f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24007e1b-5bcd-4d14-91b7-51b05fc5366f
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-24007e1b-5bcd-4d14-91b7-51b05fc5366f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 16
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-50890b34-b324-48fe-be63-c603b7f73f09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50890b34-b324-48fe-be63-c603b7f73f09
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-50890b34-b324-48fe-be63-c603b7f73f09
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 15
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-d5211229-f100-40e1-ab38-3028cf3f27de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5211229-f100-40e1-ab38-3028cf3f27de
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5211229-f100-40e1-ab38-3028cf3f27de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 14
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-b6fbb35a-7a20-4aa6-b8d7-9415dc4ccf18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6fbb35a-7a20-4aa6-b8d7-9415dc4ccf18
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b6fbb35a-7a20-4aa6-b8d7-9415dc4ccf18
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 13
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-d088016c-5578-403c-a359-d86654544b6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d088016c-5578-403c-a359-d86654544b6c
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-d088016c-5578-403c-a359-d86654544b6c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 12
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-5a021d92-be74-4f97-bdf3-6c7b3eb63e3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a021d92-be74-4f97-bdf3-6c7b3eb63e3e
Content-Type: application/json

--- response: 200 in 1 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a021d92-be74-4f97-bdf3-6c7b3eb63e3e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 11
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-10df4aca-98a3-4680-a8db-ae1cac1b05bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10df4aca-98a3-4680-a8db-ae1cac1b05bc
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-10df4aca-98a3-4680-a8db-ae1cac1b05bc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 10
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-07a78c6f-934c-4fbc-9e44-4aef15e8443c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07a78c6f-934c-4fbc-9e44-4aef15e8443c
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-07a78c6f-934c-4fbc-9e44-4aef15e8443c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 9
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-7f8c26e5-21d8-4511-8582-4144755ce4ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f8c26e5-21d8-4511-8582-4144755ce4ad
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f8c26e5-21d8-4511-8582-4144755ce4ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 8
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-05f00c88-b2f0-4976-931d-e7ff2d50ae02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05f00c88-b2f0-4976-931d-e7ff2d50ae02
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-05f00c88-b2f0-4976-931d-e7ff2d50ae02
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 7
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-2db3b705-8efb-4b49-9974-8e854fbc43b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2db3b705-8efb-4b49-9974-8e854fbc43b6
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-2db3b705-8efb-4b49-9974-8e854fbc43b6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 6
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-a6a6f706-f490-4b4e-88fc-05c521ff827a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6a6f706-f490-4b4e-88fc-05c521ff827a
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6a6f706-f490-4b4e-88fc-05c521ff827a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 5
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-bafa5f25-7204-492a-a7bd-4c1438fe48f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bafa5f25-7204-492a-a7bd-4c1438fe48f0
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-bafa5f25-7204-492a-a7bd-4c1438fe48f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 4
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-7102ea92-a309-4f02-a625-fafb3ed27b45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7102ea92-a309-4f02-a625-fafb3ed27b45
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-7102ea92-a309-4f02-a625-fafb3ed27b45
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 3
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-0838c10f-3f76-47f7-8ef9-a0a04f8411b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0838c10f-3f76-47f7-8ef9-a0a04f8411b1
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-0838c10f-3f76-47f7-8ef9-a0a04f8411b1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 2
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-77ecbca2-a5d2-45f6-bb43-634bbe240c5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77ecbca2-a5d2-45f6-bb43-634bbe240c5f
Content-Type: application/json

--- response: 200 in 2 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-77ecbca2-a5d2-45f6-bb43-634bbe240c5f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 1
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-d7e54fa2-2832-48a5-ab9a-903aa4bfaf9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7e54fa2-2832-48a5-ab9a-903aa4bfaf9a
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-d7e54fa2-2832-48a5-ab9a-903aa4bfaf9a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-b8b11e16-eb50-40f7-b224-7492e2aa6746

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8b11e16-eb50-40f7-b224-7492e2aa6746
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b8b11e16-eb50-40f7-b224-7492e2aa6746
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b8b11e16-eb50-40f7-b224-7492e2aa6746"}
```

## 65. POST /v1/auth/token

```text
#65 POST http://localhost:7070/v1/auth/token
correlation: qa-fd467b02-304e-4df2-a834-7b7f236ab53b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd467b02-304e-4df2-a834-7b7f236ab53b
Content-Type: application/json

--- request body ---
{"handle":"qa-842b9d07e46d","password":"****"}

--- response: 429 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fd467b02-304e-4df2-a834-7b7f236ab53b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 240

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/auth/token","correlationId":"qa-fd467b02-304e-4df2-a834-7b7f236ab53b"}
```

## 66. POST /v1/accounts

```text
#66 POST http://localhost:7070/v1/accounts
correlation: qa-b6f40db6-ffd9-4ef7-900f-f47a35a4a295

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6f40db6-ffd9-4ef7-900f-f47a35a4a295
Content-Type: application/json

--- request body ---
{"handle":"qa-b15cb8a1d31b","displayName":"QA b15cb8a1d31b","password":"****","region":"eu"}

--- response: 429 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b6f40db6-ffd9-4ef7-900f-f47a35a4a295
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 238

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts","correlationId":"qa-b6f40db6-ffd9-4ef7-900f-f47a35a4a295"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-439c3bbd-e96a-4a66-8d3d-605f506417ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-439c3bbd-e96a-4a66-8d3d-605f506417ce
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-439c3bbd-e96a-4a66-8d3d-605f506417ce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-439c3bbd-e96a-4a66-8d3d-605f506417ce"}
```

## 68. PATCH /v1/accounts/me

```text
#68 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-a6abcacb-49b4-4453-8cce-5e7d61727b92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6abcacb-49b4-4453-8cce-5e7d61727b92
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 429 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a6abcacb-49b4-4453-8cce-5e7d61727b92
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a6abcacb-49b4-4453-8cce-5e7d61727b92"}
```

## 69. DELETE /v1/accounts/me

```text
#69 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-84e8fd0a-d92e-4ed7-96df-5540b20574e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84e8fd0a-d92e-4ed7-96df-5540b20574e8
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-84e8fd0a-d92e-4ed7-96df-5540b20574e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-84e8fd0a-d92e-4ed7-96df-5540b20574e8"}
```

## 70. GET /v1/accounts/{handle}

```text
#70 GET http://localhost:7070/v1/accounts/qa-842b9d07e46d
correlation: qa-cfadfa70-715b-46c5-b855-2294ce1c2933

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfadfa70-715b-46c5-b855-2294ce1c2933
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cfadfa70-715b-46c5-b855-2294ce1c2933
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 254

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/qa-842b9d07e46d","correlationId":"qa-cfadfa70-715b-46c5-b855-2294ce1c2933"}
```

## 71. POST /v1/conversations

```text
#71 POST http://localhost:7070/v1/conversations
correlation: qa-b0d5036a-14d3-4caf-ad90-b717b7ac123c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0d5036a-14d3-4caf-ad90-b717b7ac123c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-842b9d07e46d","subject":"Probe","message":"Hi"}

--- response: 429 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b0d5036a-14d3-4caf-ad90-b717b7ac123c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 243

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-b0d5036a-14d3-4caf-ad90-b717b7ac123c"}
```

## 72. GET /v1/conversations

```text
#72 GET http://localhost:7070/v1/conversations
correlation: qa-77333c28-f702-4a87-8f4f-1a8e2ba68b00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77333c28-f702-4a87-8f4f-1a8e2ba68b00
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-77333c28-f702-4a87-8f4f-1a8e2ba68b00
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 243

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-77333c28-f702-4a87-8f4f-1a8e2ba68b00"}
```

## 73. GET /v1/conversations/{id}

```text
#73 GET http://localhost:7070/v1/conversations/cnv_f4a526fe-8d39-4deb-951e-6870ee28caf4
correlation: qa-71ded565-1903-403e-a756-039914df49f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71ded565-1903-403e-a756-039914df49f1
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-71ded565-1903-403e-a756-039914df49f1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 284

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_f4a526fe-8d39-4deb-951e-6870ee28caf4","correlationId":"qa-71ded565-1903-403e-a756-039914df49f1"}
```

## 74. GET /v1/conversations/{id}/messages

```text
#74 GET http://localhost:7070/v1/conversations/cnv_f4a526fe-8d39-4deb-951e-6870ee28caf4/messages
correlation: qa-67254b56-3132-4cae-98a3-a4397a62cfcf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67254b56-3132-4cae-98a3-a4397a62cfcf
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-67254b56-3132-4cae-98a3-a4397a62cfcf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 293

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_f4a526fe-8d39-4deb-951e-6870ee28caf4/messages","correlationId":"qa-67254b56-3132-4cae-98a3-a4397a62cfcf"}
```

## 75. POST /v1/conversations/{id}/messages

```text
#75 POST http://localhost:7070/v1/conversations/cnv_f4a526fe-8d39-4deb-951e-6870ee28caf4/messages
correlation: qa-23b448ed-3aa3-406e-a122-d95ac84f1b95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23b448ed-3aa3-406e-a122-d95ac84f1b95
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 429 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-23b448ed-3aa3-406e-a122-d95ac84f1b95
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 293

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_f4a526fe-8d39-4deb-951e-6870ee28caf4/messages","correlationId":"qa-23b448ed-3aa3-406e-a122-d95ac84f1b95"}
```

## 76. POST /v1/conversations/{id}/read

```text
#76 POST http://localhost:7070/v1/conversations/cnv_f4a526fe-8d39-4deb-951e-6870ee28caf4/read
correlation: qa-f6f95616-6264-4310-b7b9-694fe371638b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6f95616-6264-4310-b7b9-694fe371638b
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f6f95616-6264-4310-b7b9-694fe371638b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 289

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_f4a526fe-8d39-4deb-951e-6870ee28caf4/read","correlationId":"qa-f6f95616-6264-4310-b7b9-694fe371638b"}
```

## 77. POST /v1/conversations/{id}/close

```text
#77 POST http://localhost:7070/v1/conversations/cnv_f4a526fe-8d39-4deb-951e-6870ee28caf4/close
correlation: qa-e9932736-8822-4998-8802-26f1bc57acec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9932736-8822-4998-8802-26f1bc57acec
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e9932736-8822-4998-8802-26f1bc57acec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 290

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_f4a526fe-8d39-4deb-951e-6870ee28caf4/close","correlationId":"qa-e9932736-8822-4998-8802-26f1bc57acec"}
```

## 78. GET /v1/credits/balance

```text
#78 GET http://localhost:7070/v1/credits/balance
correlation: qa-2d41b818-a5fb-445d-ab78-3181672a5ca5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d41b818-a5fb-445d-ab78-3181672a5ca5
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2d41b818-a5fb-445d-ab78-3181672a5ca5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 245

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/balance","correlationId":"qa-2d41b818-a5fb-445d-ab78-3181672a5ca5"}
```

## 79. GET /v1/credits/ledger

```text
#79 GET http://localhost:7070/v1/credits/ledger
correlation: qa-9b78f4d2-6edc-4aa0-90b2-2d707a4efea2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b78f4d2-6edc-4aa0-90b2-2d707a4efea2
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9b78f4d2-6edc-4aa0-90b2-2d707a4efea2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 244

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/ledger","correlationId":"qa-9b78f4d2-6edc-4aa0-90b2-2d707a4efea2"}
```

## 80. POST /v1/credits/purchases

```text
#80 POST http://localhost:7070/v1/credits/purchases
correlation: qa-7b787934-d8e4-4146-afc5-3a8216f74b68

--- request headers ---
Accept: application/json
Idempotency-Key: qa-25e17d111fef434fb5ed11c39cb29275
X-Correlation-Id: qa-7b787934-d8e4-4146-afc5-3a8216f74b68
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 429 in 6 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7b787934-d8e4-4146-afc5-3a8216f74b68
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 247

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/purchases","correlationId":"qa-7b787934-d8e4-4146-afc5-3a8216f74b68"}
```

## 81. GET /v1/admin/stats

```text
#81 GET http://localhost:7070/v1/admin/stats
correlation: qa-f0d3a44e-6e88-4dd5-ae20-716800c2aa2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0d3a44e-6e88-4dd5-ae20-716800c2aa2a
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f0d3a44e-6e88-4dd5-ae20-716800c2aa2a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/admin/stats","correlationId":"qa-f0d3a44e-6e88-4dd5-ae20-716800c2aa2a"}
```

## 82. GET /v1/accounts/me

```text
#82 GET http://localhost:7070/v1/accounts/me
correlation: qa-c5ba6ad4-49b2-40a0-b98f-fcebc3b61dc2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5ba6ad4-49b2-40a0-b98f-fcebc3b61dc2
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c5ba6ad4-49b2-40a0-b98f-fcebc3b61dc2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c5ba6ad4-49b2-40a0-b98f-fcebc3b61dc2"}
```

## 83. GET /v1/accounts/me

```text
#83 GET http://localhost:7070/v1/accounts/me
correlation: qa-428f8c45-98b0-4c81-a092-1930981a15f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-428f8c45-98b0-4c81-a092-1930981a15f7
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-428f8c45-98b0-4c81-a092-1930981a15f7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-428f8c45-98b0-4c81-a092-1930981a15f7"}
```

## 84. GET /v1/accounts/me

```text
#84 GET http://localhost:7070/v1/accounts/me
correlation: qa-f97a22b4-9801-4d0e-92ee-d9b74bcc0900

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f97a22b4-9801-4d0e-92ee-d9b74bcc0900
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Sun, 08 Nov 2026 09:09:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f97a22b4-9801-4d0e-92ee-d9b74bcc0900
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f97a22b4-9801-4d0e-92ee-d9b74bcc0900"}
```

## 85. GET /v1/accounts/me

```text
#85 GET http://localhost:7070/v1/accounts/me
correlation: qa-a7c796a8-9795-44f2-bdff-4eeb1117565d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7c796a8-9795-44f2-bdff-4eeb1117565d
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a7c796a8-9795-44f2-bdff-4eeb1117565d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a7c796a8-9795-44f2-bdff-4eeb1117565d"}
```

## 86. GET /v1/accounts/me

```text
#86 GET http://localhost:7070/v1/accounts/me
correlation: qa-95425a13-a9b0-48cf-801a-9e5c6a670d7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95425a13-a9b0-48cf-801a-9e5c6a670d7c
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-95425a13-a9b0-48cf-801a-9e5c6a670d7c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-95425a13-a9b0-48cf-801a-9e5c6a670d7c"}
```

## 87. GET /v1/accounts/me

```text
#87 GET http://localhost:7070/v1/accounts/me
correlation: qa-79298389-ac5f-4b8f-baff-5e35540537d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79298389-ac5f-4b8f-baff-5e35540537d3
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-79298389-ac5f-4b8f-baff-5e35540537d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-79298389-ac5f-4b8f-baff-5e35540537d3"}
```

## 88. GET /v1/accounts/me

```text
#88 GET http://localhost:7070/v1/accounts/me
correlation: qa-a25ec2f4-b1e0-4e8a-bda6-17e44abb6719

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a25ec2f4-b1e0-4e8a-bda6-17e44abb6719
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a25ec2f4-b1e0-4e8a-bda6-17e44abb6719
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a25ec2f4-b1e0-4e8a-bda6-17e44abb6719"}
```

## 89. GET /v1/accounts/me

```text
#89 GET http://localhost:7070/v1/accounts/me
correlation: qa-2ccbd057-cea5-4c4f-85f1-6973bce23361

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ccbd057-cea5-4c4f-85f1-6973bce23361
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2ccbd057-cea5-4c4f-85f1-6973bce23361
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2ccbd057-cea5-4c4f-85f1-6973bce23361"}
```

## 90. GET /v1/accounts/me

```text
#90 GET http://localhost:7070/v1/accounts/me
correlation: qa-666bfd5a-dba6-4c23-b3d1-6b52069bda63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-666bfd5a-dba6-4c23-b3d1-6b52069bda63
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Sun, 08 Nov 2026 09:09:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-666bfd5a-dba6-4c23-b3d1-6b52069bda63
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-666bfd5a-dba6-4c23-b3d1-6b52069bda63"}
```

## 91. GET /v1/accounts/me

```text
#91 GET http://localhost:7070/v1/accounts/me
correlation: qa-7355a00d-abae-4a20-a83d-5644acb777ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7355a00d-abae-4a20-a83d-5644acb777ae
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7355a00d-abae-4a20-a83d-5644acb777ae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7355a00d-abae-4a20-a83d-5644acb777ae"}
```

## 92. GET /v1/accounts/me

```text
#92 GET http://localhost:7070/v1/accounts/me
correlation: qa-62be7701-6532-4337-813c-86f4b08e4d89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62be7701-6532-4337-813c-86f4b08e4d89
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-62be7701-6532-4337-813c-86f4b08e4d89
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-62be7701-6532-4337-813c-86f4b08e4d89"}
```

## 93. GET /v1/accounts/me

```text
#93 GET http://localhost:7070/v1/accounts/me
correlation: qa-0a49b464-f6b8-4c05-bdc2-66788d022860

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a49b464-f6b8-4c05-bdc2-66788d022860
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0a49b464-f6b8-4c05-bdc2-66788d022860
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-0a49b464-f6b8-4c05-bdc2-66788d022860"}
```

## 94. GET /v1/accounts/me

```text
#94 GET http://localhost:7070/v1/accounts/me
correlation: qa-93446afd-18d6-4d12-be7d-c509d2780bea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93446afd-18d6-4d12-be7d-c509d2780bea
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-93446afd-18d6-4d12-be7d-c509d2780bea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-93446afd-18d6-4d12-be7d-c509d2780bea"}
```

## 95. GET /v1/accounts/me

```text
#95 GET http://localhost:7070/v1/accounts/me
correlation: qa-09a6721f-d7bc-49c0-a0da-63dfded3a502

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09a6721f-d7bc-49c0-a0da-63dfded3a502
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-09a6721f-d7bc-49c0-a0da-63dfded3a502
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-09a6721f-d7bc-49c0-a0da-63dfded3a502"}
```

## 96. GET /v1/accounts/me

```text
#96 GET http://localhost:7070/v1/accounts/me
correlation: qa-fc57cb9b-ee2e-43a6-a98a-6961c15191e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc57cb9b-ee2e-43a6-a98a-6961c15191e4
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fc57cb9b-ee2e-43a6-a98a-6961c15191e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-fc57cb9b-ee2e-43a6-a98a-6961c15191e4"}
```

## 97. GET /v1/accounts/me

```text
#97 GET http://localhost:7070/v1/accounts/me
correlation: qa-04e25293-0966-407b-95ad-82465a483ddf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04e25293-0966-407b-95ad-82465a483ddf
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-04e25293-0966-407b-95ad-82465a483ddf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-04e25293-0966-407b-95ad-82465a483ddf"}
```

## 98. GET /v1/accounts/me

```text
#98 GET http://localhost:7070/v1/accounts/me
correlation: qa-c814e7e6-9318-4d97-a816-1e878f94fa33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c814e7e6-9318-4d97-a816-1e878f94fa33
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c814e7e6-9318-4d97-a816-1e878f94fa33
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c814e7e6-9318-4d97-a816-1e878f94fa33"}
```

## 99. GET /v1/accounts/me

```text
#99 GET http://localhost:7070/v1/accounts/me
correlation: qa-6a3065b1-ffb2-4a41-b818-c29b63f321b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a3065b1-ffb2-4a41-b818-c29b63f321b7
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a3065b1-ffb2-4a41-b818-c29b63f321b7
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
Content-Length: 181

{"id":"acc_5fb6a7ee-346b-45ef-9645-8d28cce232ab","handle":"qa-842b9d07e46d","displayName":"QA 842b9d07e46d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.864421073Z"}
```

## 100. POST /v1/auth/token

```text
#100 POST http://localhost:7070/v1/auth/token
correlation: qa-86f67d2f-610a-4b45-b5e2-95034e18e54b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86f67d2f-610a-4b45-b5e2-95034e18e54b
Content-Type: application/json

--- request body ---
{"handle":"qa-2006f300bf74","password":"****"}

--- response: 200 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-86f67d2f-610a-4b45-b5e2-95034e18e54b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_295136ab-46f6-4653-b6ef-a807c4eacb55"}
```

## 101. DELETE /v1/accounts/me

```text
#101 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-85667c26-ea89-4b2b-baac-63a18a2cad3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85667c26-ea89-4b2b-baac-63a18a2cad3e
Content-Type: application/json

--- response: 204 in 1 ms ---
Date: Sun, 08 Nov 2026 09:09:13 GMT
Content-Type: text/plain
X-Correlation-Id: qa-85667c26-ea89-4b2b-baac-63a18a2cad3e
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

## 102. POST /v1/auth/token

```text
#102 POST http://localhost:7070/v1/auth/token
correlation: qa-34babeb6-23fe-4c73-b678-a2acd2ce7f4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34babeb6-23fe-4c73-b678-a2acd2ce7f4d
Content-Type: application/json

--- request body ---
{"handle":"qa-2006f300bf74","password":"****"}

--- response: 401 in 2 ms ---
Date: Sun, 08 Nov 2026 09:09:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-34babeb6-23fe-4c73-b678-a2acd2ce7f4d
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-34babeb6-23fe-4c73-b678-a2acd2ce7f4d"}
```

## 103. DELETE /v1/accounts/me

```text
#103 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-793281cb-e3e0-4e95-bcb0-b8edef2296e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-793281cb-e3e0-4e95-bcb0-b8edef2296e3
Content-Type: application/json

--- response: 204 in 1 ms ---
Date: Sun, 08 Nov 2026 09:09:13 GMT
Content-Type: text/plain
X-Correlation-Id: qa-793281cb-e3e0-4e95-bcb0-b8edef2296e3
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

## 104. POST /v1/auth/token

```text
#104 POST http://localhost:7070/v1/auth/token
correlation: qa-3765092f-df11-4ee6-96c3-75d212636f89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3765092f-df11-4ee6-96c3-75d212636f89
Content-Type: application/json

--- request body ---
{"handle":"qa-842b9d07e46d","password":"****"}

--- response: 401 in 1 ms ---
Date: Sun, 08 Nov 2026 09:09:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3765092f-df11-4ee6-96c3-75d212636f89
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3765092f-df11-4ee6-96c3-75d212636f89"}
```

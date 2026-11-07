# Transcript: Past its rate limit, a token gets a 429 problem from every operation

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#pastTheLimitEveryOperationIsA429` |
| Features | FEAT-RATE-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 103 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-20a2c93a-f550-439a-9463-a53281751b74` |
| 2 | `POST /v1/accounts` | 201 | 21 | `qa-bb035e8f-5ab9-4b01-8434-0b31ef112aae` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-fd9236ed-9343-4145-a45b-2c8b25ea1fc9` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-d3f07f4e-1d87-40d1-804e-fea47d05fa47` |
| 5 | `GET /v1/accounts/me` | 200 | 12 | `qa-cf761caf-118d-4309-8eb1-3c1040f0c6dc` |
| 6 | `GET /v1/accounts/me` | 200 | 11 | `qa-3640d2f0-df8f-4f45-b802-8735ca9840b9` |
| 7 | `GET /v1/accounts/me` | 200 | 10 | `qa-594a1a60-7674-48f2-99a3-9ea49e7edf98` |
| 8 | `GET /v1/accounts/me` | 200 | 14 | `qa-19afb3fb-9b70-4601-981e-b89324786b1e` |
| 9 | `GET /v1/accounts/me` | 200 | 19 | `qa-166ab168-cca2-4b29-b6b5-0ff1e56b0abc` |
| 10 | `GET /v1/accounts/me` | 200 | 24 | `qa-48e4dcd9-30d7-4adb-8df9-864c814c6b22` |
| 11 | `GET /v1/accounts/me` | 200 | 21 | `qa-59f612b2-a837-4de9-8a85-7a2075d079b7` |
| 12 | `GET /v1/accounts/me` | 200 | 10 | `qa-20ede1b5-2b21-4895-910b-8af66dd5b75c` |
| 13 | `GET /v1/accounts/me` | 200 | 14 | `qa-f6ff0a1a-b7c0-4115-90d4-52c8cef70c15` |
| 14 | `GET /v1/accounts/me` | 200 | 14 | `qa-367d99eb-afad-4fd2-b277-fbb8da0aeb13` |
| 15 | `GET /v1/accounts/me` | 200 | 18 | `qa-6e2dc737-7905-404d-920a-bd256a1e03db` |
| 16 | `GET /v1/accounts/me` | 200 | 3 | `qa-2d7043e8-04cd-4a9f-b2e4-2742bd714d61` |
| 17 | `GET /v1/accounts/me` | 200 | 21 | `qa-963d7e86-5e00-422f-943c-e8a6b1d7302f` |
| 18 | `GET /v1/accounts/me` | 200 | 10 | `qa-091e53b1-af65-464d-9494-836442f03398` |
| 19 | `GET /v1/accounts/me` | 200 | 9 | `qa-6bf4fe9c-9265-4b9a-b758-ffa1ddb7e873` |
| 20 | `GET /v1/accounts/me` | 200 | 10 | `qa-8e3c3c22-ed5b-4e5a-9d1d-2d787ddf373e` |
| 21 | `GET /v1/accounts/me` | 200 | 20 | `qa-0b0572e9-bb2a-4f00-ac9c-5b9a003517b4` |
| 22 | `GET /v1/accounts/me` | 200 | 22 | `qa-68b265e9-a8f8-4df2-96f7-3b1b1cae0e16` |
| 23 | `GET /v1/accounts/me` | 200 | 12 | `qa-83e6f255-7fb3-4faf-a4fd-c7322412d479` |
| 24 | `GET /v1/accounts/me` | 200 | 12 | `qa-f9f051ae-179d-407b-9b42-965236a48d42` |
| 25 | `GET /v1/accounts/me` | 200 | 5 | `qa-b6901d40-ecc9-4bf4-b770-f1d201cebe49` |
| 26 | `GET /v1/accounts/me` | 200 | 10 | `qa-5a22671a-b967-44f1-8934-b3359f711fb2` |
| 27 | `GET /v1/accounts/me` | 200 | 17 | `qa-e3629e38-ba44-4d02-8a47-4554e4b728d9` |
| 28 | `GET /v1/accounts/me` | 200 | 13 | `qa-4776fa51-4742-4baa-9fa0-4cdb84642f77` |
| 29 | `GET /v1/accounts/me` | 200 | 14 | `qa-653875f3-5915-45a0-af93-6a3cc2382122` |
| 30 | `GET /v1/accounts/me` | 200 | 8 | `qa-bdbff142-4db5-40a1-a49b-32e8c6349566` |
| 31 | `GET /v1/accounts/me` | 200 | 20 | `qa-68cbae93-96c2-42da-8d18-934acdbef3f3` |
| 32 | `GET /v1/accounts/me` | 200 | 17 | `qa-4cc123c4-c7bc-437c-8f59-7228de798455` |
| 33 | `GET /v1/accounts/me` | 200 | 17 | `qa-ee442ba1-3ec2-4c50-917a-d6a5f77cc066` |
| 34 | `GET /v1/accounts/me` | 200 | 45 | `qa-490c1c46-3a1f-438b-8d57-e7fab4ff8db2` |
| 35 | `GET /v1/accounts/me` | 200 | 14 | `qa-c9a147e5-0e25-42ae-bab9-3bb8a18210a6` |
| 36 | `GET /v1/accounts/me` | 200 | 6 | `qa-72568b28-2f38-4330-aa3e-9801ecc01bb5` |
| 37 | `GET /v1/accounts/me` | 200 | 7 | `qa-a12ce9c8-0f28-4306-acb4-17f86b30161e` |
| 38 | `GET /v1/accounts/me` | 200 | 11 | `qa-312c0854-7dd8-4e8b-98aa-78105c0a011e` |
| 39 | `GET /v1/accounts/me` | 200 | 14 | `qa-cc9c2ad0-0eab-4a93-a123-136ad3e414c1` |
| 40 | `GET /v1/accounts/me` | 200 | 6 | `qa-51b0a4bc-c6ba-42a2-9eef-aa7d5325384f` |
| 41 | `GET /v1/accounts/me` | 200 | 17 | `qa-d1ac9ec3-acb1-448c-8b99-c44af5928974` |
| 42 | `GET /v1/accounts/me` | 200 | 7 | `qa-bc3e3c35-2cf2-49c5-86bc-c70a9f8c0b4c` |
| 43 | `GET /v1/accounts/me` | 200 | 10 | `qa-afc32c61-67ca-49f1-8768-b61b63edc1a6` |
| 44 | `GET /v1/accounts/me` | 200 | 8 | `qa-164d3ec8-a797-4e13-bb27-177f08d535d4` |
| 45 | `GET /v1/accounts/me` | 200 | 4 | `qa-ff0f2821-96f6-4578-b2c8-6189c9363180` |
| 46 | `GET /v1/accounts/me` | 200 | 6 | `qa-02190977-d4ce-4b09-bd0a-30f7fe948ad6` |
| 47 | `GET /v1/accounts/me` | 200 | 4 | `qa-c2f487ba-0933-4bc4-a5bb-3d55463723e3` |
| 48 | `GET /v1/accounts/me` | 200 | 5 | `qa-2e114de1-b3b5-4297-bf2c-82548dee6df3` |
| 49 | `GET /v1/accounts/me` | 200 | 2 | `qa-2449bb55-619c-46d4-80cd-462d305b199a` |
| 50 | `GET /v1/accounts/me` | 200 | 10 | `qa-9ba3082b-c657-42ef-92db-26726f040b96` |
| 51 | `GET /v1/accounts/me` | 200 | 6 | `qa-0d14f49e-fcdc-4d11-b72f-058caf554d80` |
| 52 | `GET /v1/accounts/me` | 200 | 13 | `qa-42320d88-1d03-4c63-bda1-568296d20712` |
| 53 | `GET /v1/accounts/me` | 200 | 13 | `qa-f1d9895f-d63b-49b8-9324-03bdb8645d81` |
| 54 | `GET /v1/accounts/me` | 200 | 10 | `qa-67e098d7-23ef-4bab-a805-3902f126489f` |
| 55 | `GET /v1/accounts/me` | 200 | 24 | `qa-c6d7d3ef-b631-4c51-9ed6-9cd5021859ae` |
| 56 | `GET /v1/accounts/me` | 200 | 17 | `qa-ca1ba485-3f36-407d-9009-312ad2e3a3aa` |
| 57 | `GET /v1/accounts/me` | 200 | 11 | `qa-7ddae2c2-9b36-45d5-8d16-448b4205cf85` |
| 58 | `GET /v1/accounts/me` | 200 | 9 | `qa-f8f2c02f-ea7f-40fb-9e69-1252e3444ce9` |
| 59 | `GET /v1/accounts/me` | 200 | 5 | `qa-c70f9909-39fd-4b94-bae9-a51adb9c5a4a` |
| 60 | `GET /v1/accounts/me` | 200 | 8 | `qa-7ab54e33-6052-478f-87c8-545ec78c5023` |
| 61 | `GET /v1/accounts/me` | 200 | 7 | `qa-2d4d587d-fd64-4b86-8281-f43114583e42` |
| 62 | `GET /v1/accounts/me` | 200 | 12 | `qa-08eb785a-cbae-4171-be68-822ddb19ff20` |
| 63 | `GET /v1/accounts/me` | 200 | 10 | `qa-a2e380f6-061b-4252-988a-9989d79288a9` |
| 64 | `GET /v1/accounts/me` | 429 | 6 | `qa-cc3d9ea5-37c4-4239-b7a4-4efd81ba5259` |
| 65 | `POST /v1/auth/token` | 429 | 2 | `qa-33ea6122-edfc-4b6b-904f-d4df88e22d9e` |
| 66 | `POST /v1/accounts` | 429 | 13 | `qa-90f5f867-b34d-4525-a6fb-b9ff6d6c6807` |
| 67 | `GET /v1/accounts/me` | 429 | 7 | `qa-cacac05c-b2b2-477b-8065-713bebde6186` |
| 68 | `PATCH /v1/accounts/me` | 429 | 4 | `qa-38bbb82a-a025-43b4-bfef-1b6a4f2bac0f` |
| 69 | `DELETE /v1/accounts/me` | 429 | 2 | `qa-74148e85-f5f8-463e-a4be-1ca90747cb88` |
| 70 | `GET /v1/accounts/{handle}` | 429 | 6 | `qa-0a6bc9c5-f0ee-478f-8601-3b79ba8c692d` |
| 71 | `POST /v1/conversations` | 429 | 3 | `qa-6c2cbaa2-a3b1-43e0-8d91-5634f9ee909c` |
| 72 | `GET /v1/conversations` | 429 | 2 | `qa-db527370-f04b-4720-8561-ff422299caa1` |
| 73 | `GET /v1/conversations/{id}` | 429 | 3 | `qa-14007213-2bec-4eee-891b-d09fe31f08d4` |
| 74 | `GET /v1/conversations/{id}/messages` | 429 | 4 | `qa-833d584f-f501-49fe-9b64-88e93c8d4f75` |
| 75 | `POST /v1/conversations/{id}/messages` | 429 | 3 | `qa-43000694-3b0a-482d-8106-2b19d9a1e062` |
| 76 | `POST /v1/conversations/{id}/read` | 429 | 3 | `qa-0e5fd5b0-15d4-42fc-bf0c-5f13f082fa22` |
| 77 | `POST /v1/conversations/{id}/close` | 429 | 2 | `qa-78cd56c6-306b-4838-8080-90a4b88c7d10` |
| 78 | `GET /v1/credits/balance` | 429 | 3 | `qa-0ebc10bb-6f9c-4229-81b1-3b2e83689ffa` |
| 79 | `GET /v1/credits/ledger` | 429 | 3 | `qa-2154aac9-1f09-46a7-9834-5939999eeed7` |
| 80 | `POST /v1/credits/purchases` | 429 | 3 | `qa-f8e03412-fb96-49be-bac8-60f1ef1b3b55` |
| 81 | `GET /v1/admin/stats` | 429 | 2 | `qa-19d65aab-fd2e-4e85-8306-a81db1ad371d` |
| 82 | `GET /v1/accounts/me` | 429 | 3 | `qa-87fb5f7b-e57c-48e1-914e-c363dd1f708d` |
| 83 | `GET /v1/accounts/me` | 429 | 3 | `qa-facc72ca-80a0-4cc2-8a89-4e8c75ea18db` |
| 84 | `GET /v1/accounts/me` | 429 | 3 | `qa-8bdcbb76-30ca-4ef1-8e81-f1a02e6b2675` |
| 85 | `GET /v1/accounts/me` | 429 | 3 | `qa-1df0497e-3f8e-4a47-99b0-84430db76e2c` |
| 86 | `GET /v1/accounts/me` | 429 | 3 | `qa-5855f5ff-22fb-4cbe-b6d1-1303330cbee0` |
| 87 | `GET /v1/accounts/me` | 429 | 3 | `qa-5899e090-f03e-4998-912e-76fa5b8eea84` |
| 88 | `GET /v1/accounts/me` | 429 | 3 | `qa-ad72838b-9884-43aa-ac86-93bdf554a210` |
| 89 | `GET /v1/accounts/me` | 429 | 3 | `qa-64575c6a-49df-46df-aaa8-51a787826f87` |
| 90 | `GET /v1/accounts/me` | 429 | 3 | `qa-74fffab7-3ad7-4ca4-b067-c7c5e2fd0f8b` |
| 91 | `GET /v1/accounts/me` | 429 | 3 | `qa-406d9dbb-5034-4b92-ab7e-c2e33e1fe4b9` |
| 92 | `GET /v1/accounts/me` | 429 | 3 | `qa-9b4549cc-5e23-4230-86fc-db7f271f7095` |
| 93 | `GET /v1/accounts/me` | 429 | 2 | `qa-ef9b725a-fd06-465f-a15f-9006ec3a92ca` |
| 94 | `GET /v1/accounts/me` | 429 | 5 | `qa-175e1e51-53ad-40f3-b2bd-6dae2fdd637d` |
| 95 | `GET /v1/accounts/me` | 429 | 4 | `qa-e0773ef6-d4c3-4b74-95c9-f8b49016209b` |
| 96 | `GET /v1/accounts/me` | 429 | 4 | `qa-4b1a29c9-0b80-4e6a-a50a-3ffd1cddbcf6` |
| 97 | `GET /v1/accounts/me` | 429 | 7 | `qa-03758d6f-992b-48be-955d-315ff7c4e73d` |
| 98 | `GET /v1/accounts/me` | 200 | 5 | `qa-5ad0bc6e-06ed-41de-9a65-053c2a8bef68` |
| 99 | `POST /v1/auth/token` | 200 | 6 | `qa-571bf1de-70a8-4c4e-9545-cc670de293da` |
| 100 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-62bcd3da-81d4-4723-baae-2e0f0729f6c3` |
| 101 | `POST /v1/auth/token` | 401 | 3 | `qa-6e4c6e63-0eff-49e9-9657-b826a5846ab9` |
| 102 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-993e0845-79f6-4b43-8de4-31116ea6d95e` |
| 103 | `POST /v1/auth/token` | 401 | 3 | `qa-6ce0b787-b562-49f3-b13c-11fb1141d860` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-20a2c93a-f550-439a-9463-a53281751b74

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20a2c93a-f550-439a-9463-a53281751b74
Content-Type: application/json

--- request body ---
{"handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-20a2c93a-f550-439a-9463-a53281751b74
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 442
RateLimit-Reset: 9
Location: /v1/accounts/qa-172cfabfae83
X-Served-Region: eu
Content-Length: 181

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-bb035e8f-5ab9-4b01-8434-0b31ef112aae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb035e8f-5ab9-4b01-8434-0b31ef112aae
Content-Type: application/json

--- request body ---
{"handle":"qa-caa0a5423f69","displayName":"QA caa0a5423f69","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb035e8f-5ab9-4b01-8434-0b31ef112aae
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
Location: /v1/accounts/qa-caa0a5423f69
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0d42b5ee-d572-40cf-8b4f-9935cde525cd","handle":"qa-caa0a5423f69","displayName":"QA caa0a5423f69","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.803396302Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-fd9236ed-9343-4145-a45b-2c8b25ea1fc9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd9236ed-9343-4145-a45b-2c8b25ea1fc9
Content-Type: application/json

--- request body ---
{"handle":"qa-172cfabfae83","password":"****"}

--- response: 200 in 24 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd9236ed-9343-4145-a45b-2c8b25ea1fc9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 427
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_87e00167-3624-4243-8f98-ed56af700c28"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d3f07f4e-1d87-40d1-804e-fea47d05fa47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3f07f4e-1d87-40d1-804e-fea47d05fa47
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-caa0a5423f69","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3f07f4e-1d87-40d1-804e-fea47d05fa47
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
Location: /v1/conversations/cnv_c5882d72-bb5e-4899-92eb-4be29071db4e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c5882d72-bb5e-4899-92eb-4be29071db4e","subject":"Error contract","status":"open","region":"eu","participants":["qa-172cfabfae83","qa-caa0a5423f69"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:02.857027478Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-cf761caf-118d-4309-8eb1-3c1040f0c6dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf761caf-118d-4309-8eb1-3c1040f0c6dc
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf761caf-118d-4309-8eb1-3c1040f0c6dc
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-3640d2f0-df8f-4f45-b802-8735ca9840b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3640d2f0-df8f-4f45-b802-8735ca9840b9
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-3640d2f0-df8f-4f45-b802-8735ca9840b9
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-594a1a60-7674-48f2-99a3-9ea49e7edf98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-594a1a60-7674-48f2-99a3-9ea49e7edf98
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-594a1a60-7674-48f2-99a3-9ea49e7edf98
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-19afb3fb-9b70-4601-981e-b89324786b1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19afb3fb-9b70-4601-981e-b89324786b1e
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-19afb3fb-9b70-4601-981e-b89324786b1e
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-166ab168-cca2-4b29-b6b5-0ff1e56b0abc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-166ab168-cca2-4b29-b6b5-0ff1e56b0abc
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-166ab168-cca2-4b29-b6b5-0ff1e56b0abc
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-48e4dcd9-30d7-4adb-8df9-864c814c6b22

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48e4dcd9-30d7-4adb-8df9-864c814c6b22
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-48e4dcd9-30d7-4adb-8df9-864c814c6b22
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-59f612b2-a837-4de9-8a85-7a2075d079b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59f612b2-a837-4de9-8a85-7a2075d079b7
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-59f612b2-a837-4de9-8a85-7a2075d079b7
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-20ede1b5-2b21-4895-910b-8af66dd5b75c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20ede1b5-2b21-4895-910b-8af66dd5b75c
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-20ede1b5-2b21-4895-910b-8af66dd5b75c
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-f6ff0a1a-b7c0-4115-90d4-52c8cef70c15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6ff0a1a-b7c0-4115-90d4-52c8cef70c15
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6ff0a1a-b7c0-4115-90d4-52c8cef70c15
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-367d99eb-afad-4fd2-b277-fbb8da0aeb13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-367d99eb-afad-4fd2-b277-fbb8da0aeb13
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-367d99eb-afad-4fd2-b277-fbb8da0aeb13
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-6e2dc737-7905-404d-920a-bd256a1e03db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e2dc737-7905-404d-920a-bd256a1e03db
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e2dc737-7905-404d-920a-bd256a1e03db
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-2d7043e8-04cd-4a9f-b2e4-2742bd714d61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d7043e8-04cd-4a9f-b2e4-2742bd714d61
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d7043e8-04cd-4a9f-b2e4-2742bd714d61
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-963d7e86-5e00-422f-943c-e8a6b1d7302f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-963d7e86-5e00-422f-943c-e8a6b1d7302f
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-963d7e86-5e00-422f-943c-e8a6b1d7302f
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-091e53b1-af65-464d-9494-836442f03398

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-091e53b1-af65-464d-9494-836442f03398
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-091e53b1-af65-464d-9494-836442f03398
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-6bf4fe9c-9265-4b9a-b758-ffa1ddb7e873

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6bf4fe9c-9265-4b9a-b758-ffa1ddb7e873
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-6bf4fe9c-9265-4b9a-b758-ffa1ddb7e873
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-8e3c3c22-ed5b-4e5a-9d1d-2d787ddf373e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e3c3c22-ed5b-4e5a-9d1d-2d787ddf373e
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e3c3c22-ed5b-4e5a-9d1d-2d787ddf373e
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-0b0572e9-bb2a-4f00-ac9c-5b9a003517b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b0572e9-bb2a-4f00-ac9c-5b9a003517b4
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b0572e9-bb2a-4f00-ac9c-5b9a003517b4
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-68b265e9-a8f8-4df2-96f7-3b1b1cae0e16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68b265e9-a8f8-4df2-96f7-3b1b1cae0e16
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-68b265e9-a8f8-4df2-96f7-3b1b1cae0e16
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-83e6f255-7fb3-4faf-a4fd-c7322412d479

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83e6f255-7fb3-4faf-a4fd-c7322412d479
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-83e6f255-7fb3-4faf-a4fd-c7322412d479
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-f9f051ae-179d-407b-9b42-965236a48d42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9f051ae-179d-407b-9b42-965236a48d42
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9f051ae-179d-407b-9b42-965236a48d42
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-b6901d40-ecc9-4bf4-b770-f1d201cebe49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6901d40-ecc9-4bf4-b770-f1d201cebe49
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b6901d40-ecc9-4bf4-b770-f1d201cebe49
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-5a22671a-b967-44f1-8934-b3359f711fb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a22671a-b967-44f1-8934-b3359f711fb2
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a22671a-b967-44f1-8934-b3359f711fb2
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-e3629e38-ba44-4d02-8a47-4554e4b728d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3629e38-ba44-4d02-8a47-4554e4b728d9
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3629e38-ba44-4d02-8a47-4554e4b728d9
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-4776fa51-4742-4baa-9fa0-4cdb84642f77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4776fa51-4742-4baa-9fa0-4cdb84642f77
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-4776fa51-4742-4baa-9fa0-4cdb84642f77
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-653875f3-5915-45a0-af93-6a3cc2382122

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-653875f3-5915-45a0-af93-6a3cc2382122
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-653875f3-5915-45a0-af93-6a3cc2382122
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-bdbff142-4db5-40a1-a49b-32e8c6349566

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bdbff142-4db5-40a1-a49b-32e8c6349566
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-bdbff142-4db5-40a1-a49b-32e8c6349566
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-68cbae93-96c2-42da-8d18-934acdbef3f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68cbae93-96c2-42da-8d18-934acdbef3f3
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-68cbae93-96c2-42da-8d18-934acdbef3f3
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-4cc123c4-c7bc-437c-8f59-7228de798455

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cc123c4-c7bc-437c-8f59-7228de798455
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-4cc123c4-c7bc-437c-8f59-7228de798455
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-ee442ba1-3ec2-4c50-917a-d6a5f77cc066

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee442ba1-3ec2-4c50-917a-d6a5f77cc066
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee442ba1-3ec2-4c50-917a-d6a5f77cc066
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-490c1c46-3a1f-438b-8d57-e7fab4ff8db2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-490c1c46-3a1f-438b-8d57-e7fab4ff8db2
Content-Type: application/json

--- response: 200 in 45 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-490c1c46-3a1f-438b-8d57-e7fab4ff8db2
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-c9a147e5-0e25-42ae-bab9-3bb8a18210a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9a147e5-0e25-42ae-bab9-3bb8a18210a6
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-c9a147e5-0e25-42ae-bab9-3bb8a18210a6
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-72568b28-2f38-4330-aa3e-9801ecc01bb5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72568b28-2f38-4330-aa3e-9801ecc01bb5
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-72568b28-2f38-4330-aa3e-9801ecc01bb5
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-a12ce9c8-0f28-4306-acb4-17f86b30161e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a12ce9c8-0f28-4306-acb4-17f86b30161e
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-a12ce9c8-0f28-4306-acb4-17f86b30161e
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-312c0854-7dd8-4e8b-98aa-78105c0a011e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-312c0854-7dd8-4e8b-98aa-78105c0a011e
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-312c0854-7dd8-4e8b-98aa-78105c0a011e
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-cc9c2ad0-0eab-4a93-a123-136ad3e414c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc9c2ad0-0eab-4a93-a123-136ad3e414c1
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc9c2ad0-0eab-4a93-a123-136ad3e414c1
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-51b0a4bc-c6ba-42a2-9eef-aa7d5325384f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51b0a4bc-c6ba-42a2-9eef-aa7d5325384f
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-51b0a4bc-c6ba-42a2-9eef-aa7d5325384f
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-d1ac9ec3-acb1-448c-8b99-c44af5928974

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1ac9ec3-acb1-448c-8b99-c44af5928974
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-d1ac9ec3-acb1-448c-8b99-c44af5928974
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-bc3e3c35-2cf2-49c5-86bc-c70a9f8c0b4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc3e3c35-2cf2-49c5-86bc-c70a9f8c0b4c
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc3e3c35-2cf2-49c5-86bc-c70a9f8c0b4c
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-afc32c61-67ca-49f1-8768-b61b63edc1a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afc32c61-67ca-49f1-8768-b61b63edc1a6
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-afc32c61-67ca-49f1-8768-b61b63edc1a6
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-164d3ec8-a797-4e13-bb27-177f08d535d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-164d3ec8-a797-4e13-bb27-177f08d535d4
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-164d3ec8-a797-4e13-bb27-177f08d535d4
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-ff0f2821-96f6-4578-b2c8-6189c9363180

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff0f2821-96f6-4578-b2c8-6189c9363180
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff0f2821-96f6-4578-b2c8-6189c9363180
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-02190977-d4ce-4b09-bd0a-30f7fe948ad6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02190977-d4ce-4b09-bd0a-30f7fe948ad6
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-02190977-d4ce-4b09-bd0a-30f7fe948ad6
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-c2f487ba-0933-4bc4-a5bb-3d55463723e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2f487ba-0933-4bc4-a5bb-3d55463723e3
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-c2f487ba-0933-4bc4-a5bb-3d55463723e3
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-2e114de1-b3b5-4297-bf2c-82548dee6df3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e114de1-b3b5-4297-bf2c-82548dee6df3
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e114de1-b3b5-4297-bf2c-82548dee6df3
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-2449bb55-619c-46d4-80cd-462d305b199a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2449bb55-619c-46d4-80cd-462d305b199a
Content-Type: application/json

--- response: 200 in 2 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-2449bb55-619c-46d4-80cd-462d305b199a
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-9ba3082b-c657-42ef-92db-26726f040b96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ba3082b-c657-42ef-92db-26726f040b96
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ba3082b-c657-42ef-92db-26726f040b96
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-0d14f49e-fcdc-4d11-b72f-058caf554d80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d14f49e-fcdc-4d11-b72f-058caf554d80
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d14f49e-fcdc-4d11-b72f-058caf554d80
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-42320d88-1d03-4c63-bda1-568296d20712

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42320d88-1d03-4c63-bda1-568296d20712
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-42320d88-1d03-4c63-bda1-568296d20712
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-f1d9895f-d63b-49b8-9324-03bdb8645d81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1d9895f-d63b-49b8-9324-03bdb8645d81
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1d9895f-d63b-49b8-9324-03bdb8645d81
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-67e098d7-23ef-4bab-a805-3902f126489f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67e098d7-23ef-4bab-a805-3902f126489f
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-67e098d7-23ef-4bab-a805-3902f126489f
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-c6d7d3ef-b631-4c51-9ed6-9cd5021859ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6d7d3ef-b631-4c51-9ed6-9cd5021859ae
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6d7d3ef-b631-4c51-9ed6-9cd5021859ae
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-ca1ba485-3f36-407d-9009-312ad2e3a3aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca1ba485-3f36-407d-9009-312ad2e3a3aa
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca1ba485-3f36-407d-9009-312ad2e3a3aa
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-7ddae2c2-9b36-45d5-8d16-448b4205cf85

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ddae2c2-9b36-45d5-8d16-448b4205cf85
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ddae2c2-9b36-45d5-8d16-448b4205cf85
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-f8f2c02f-ea7f-40fb-9e69-1252e3444ce9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8f2c02f-ea7f-40fb-9e69-1252e3444ce9
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8f2c02f-ea7f-40fb-9e69-1252e3444ce9
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-c70f9909-39fd-4b94-bae9-a51adb9c5a4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c70f9909-39fd-4b94-bae9-a51adb9c5a4a
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-c70f9909-39fd-4b94-bae9-a51adb9c5a4a
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-7ab54e33-6052-478f-87c8-545ec78c5023

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ab54e33-6052-478f-87c8-545ec78c5023
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ab54e33-6052-478f-87c8-545ec78c5023
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-2d4d587d-fd64-4b86-8281-f43114583e42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d4d587d-fd64-4b86-8281-f43114583e42
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d4d587d-fd64-4b86-8281-f43114583e42
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 2
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-08eb785a-cbae-4171-be68-822ddb19ff20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08eb785a-cbae-4171-be68-822ddb19ff20
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-08eb785a-cbae-4171-be68-822ddb19ff20
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-a2e380f6-061b-4252-988a-9989d79288a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2e380f6-061b-4252-988a-9989d79288a9
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2e380f6-061b-4252-988a-9989d79288a9
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-cc3d9ea5-37c4-4239-b7a4-4efd81ba5259

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc3d9ea5-37c4-4239-b7a4-4efd81ba5259
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cc3d9ea5-37c4-4239-b7a4-4efd81ba5259
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-cc3d9ea5-37c4-4239-b7a4-4efd81ba5259"}
```

## 65. POST /v1/auth/token

```text
#65 POST http://localhost:7070/v1/auth/token
correlation: qa-33ea6122-edfc-4b6b-904f-d4df88e22d9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33ea6122-edfc-4b6b-904f-d4df88e22d9e
Content-Type: application/json

--- request body ---
{"handle":"qa-172cfabfae83","password":"****"}

--- response: 429 in 2 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-33ea6122-edfc-4b6b-904f-d4df88e22d9e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/auth/token","correlationId":"qa-33ea6122-edfc-4b6b-904f-d4df88e22d9e"}
```

## 66. POST /v1/accounts

```text
#66 POST http://localhost:7070/v1/accounts
correlation: qa-90f5f867-b34d-4525-a6fb-b9ff6d6c6807

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90f5f867-b34d-4525-a6fb-b9ff6d6c6807
Content-Type: application/json

--- request body ---
{"handle":"qa-c9d96d95cecd","displayName":"QA c9d96d95cecd","password":"****","region":"eu"}

--- response: 429 in 13 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-90f5f867-b34d-4525-a6fb-b9ff6d6c6807
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts","correlationId":"qa-90f5f867-b34d-4525-a6fb-b9ff6d6c6807"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-cacac05c-b2b2-477b-8065-713bebde6186

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cacac05c-b2b2-477b-8065-713bebde6186
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cacac05c-b2b2-477b-8065-713bebde6186
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-cacac05c-b2b2-477b-8065-713bebde6186"}
```

## 68. PATCH /v1/accounts/me

```text
#68 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-38bbb82a-a025-43b4-bfef-1b6a4f2bac0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38bbb82a-a025-43b4-bfef-1b6a4f2bac0f
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 429 in 4 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-38bbb82a-a025-43b4-bfef-1b6a4f2bac0f
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-38bbb82a-a025-43b4-bfef-1b6a4f2bac0f"}
```

## 69. DELETE /v1/accounts/me

```text
#69 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-74148e85-f5f8-463e-a4be-1ca90747cb88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74148e85-f5f8-463e-a4be-1ca90747cb88
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-74148e85-f5f8-463e-a4be-1ca90747cb88
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-74148e85-f5f8-463e-a4be-1ca90747cb88"}
```

## 70. GET /v1/accounts/{handle}

```text
#70 GET http://localhost:7070/v1/accounts/qa-172cfabfae83
correlation: qa-0a6bc9c5-f0ee-478f-8601-3b79ba8c692d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a6bc9c5-f0ee-478f-8601-3b79ba8c692d
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0a6bc9c5-f0ee-478f-8601-3b79ba8c692d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/qa-172cfabfae83","correlationId":"qa-0a6bc9c5-f0ee-478f-8601-3b79ba8c692d"}
```

## 71. POST /v1/conversations

```text
#71 POST http://localhost:7070/v1/conversations
correlation: qa-6c2cbaa2-a3b1-43e0-8d91-5634f9ee909c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c2cbaa2-a3b1-43e0-8d91-5634f9ee909c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-172cfabfae83","subject":"Probe","message":"Hi"}

--- response: 429 in 3 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6c2cbaa2-a3b1-43e0-8d91-5634f9ee909c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-6c2cbaa2-a3b1-43e0-8d91-5634f9ee909c"}
```

## 72. GET /v1/conversations

```text
#72 GET http://localhost:7070/v1/conversations
correlation: qa-db527370-f04b-4720-8561-ff422299caa1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db527370-f04b-4720-8561-ff422299caa1
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-db527370-f04b-4720-8561-ff422299caa1
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-db527370-f04b-4720-8561-ff422299caa1"}
```

## 73. GET /v1/conversations/{id}

```text
#73 GET http://localhost:7070/v1/conversations/cnv_c5882d72-bb5e-4899-92eb-4be29071db4e
correlation: qa-14007213-2bec-4eee-891b-d09fe31f08d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14007213-2bec-4eee-891b-d09fe31f08d4
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-14007213-2bec-4eee-891b-d09fe31f08d4
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_c5882d72-bb5e-4899-92eb-4be29071db4e","correlationId":"qa-14007213-2bec-4eee-891b-d09fe31f08d4"}
```

## 74. GET /v1/conversations/{id}/messages

```text
#74 GET http://localhost:7070/v1/conversations/cnv_c5882d72-bb5e-4899-92eb-4be29071db4e/messages
correlation: qa-833d584f-f501-49fe-9b64-88e93c8d4f75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-833d584f-f501-49fe-9b64-88e93c8d4f75
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-833d584f-f501-49fe-9b64-88e93c8d4f75
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_c5882d72-bb5e-4899-92eb-4be29071db4e/messages","correlationId":"qa-833d584f-f501-49fe-9b64-88e93c8d4f75"}
```

## 75. POST /v1/conversations/{id}/messages

```text
#75 POST http://localhost:7070/v1/conversations/cnv_c5882d72-bb5e-4899-92eb-4be29071db4e/messages
correlation: qa-43000694-3b0a-482d-8106-2b19d9a1e062

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43000694-3b0a-482d-8106-2b19d9a1e062
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 429 in 3 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-43000694-3b0a-482d-8106-2b19d9a1e062
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_c5882d72-bb5e-4899-92eb-4be29071db4e/messages","correlationId":"qa-43000694-3b0a-482d-8106-2b19d9a1e062"}
```

## 76. POST /v1/conversations/{id}/read

```text
#76 POST http://localhost:7070/v1/conversations/cnv_c5882d72-bb5e-4899-92eb-4be29071db4e/read
correlation: qa-0e5fd5b0-15d4-42fc-bf0c-5f13f082fa22

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e5fd5b0-15d4-42fc-bf0c-5f13f082fa22
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0e5fd5b0-15d4-42fc-bf0c-5f13f082fa22
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_c5882d72-bb5e-4899-92eb-4be29071db4e/read","correlationId":"qa-0e5fd5b0-15d4-42fc-bf0c-5f13f082fa22"}
```

## 77. POST /v1/conversations/{id}/close

```text
#77 POST http://localhost:7070/v1/conversations/cnv_c5882d72-bb5e-4899-92eb-4be29071db4e/close
correlation: qa-78cd56c6-306b-4838-8080-90a4b88c7d10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78cd56c6-306b-4838-8080-90a4b88c7d10
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-78cd56c6-306b-4838-8080-90a4b88c7d10
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_c5882d72-bb5e-4899-92eb-4be29071db4e/close","correlationId":"qa-78cd56c6-306b-4838-8080-90a4b88c7d10"}
```

## 78. GET /v1/credits/balance

```text
#78 GET http://localhost:7070/v1/credits/balance
correlation: qa-0ebc10bb-6f9c-4229-81b1-3b2e83689ffa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ebc10bb-6f9c-4229-81b1-3b2e83689ffa
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0ebc10bb-6f9c-4229-81b1-3b2e83689ffa
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/balance","correlationId":"qa-0ebc10bb-6f9c-4229-81b1-3b2e83689ffa"}
```

## 79. GET /v1/credits/ledger

```text
#79 GET http://localhost:7070/v1/credits/ledger
correlation: qa-2154aac9-1f09-46a7-9834-5939999eeed7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2154aac9-1f09-46a7-9834-5939999eeed7
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2154aac9-1f09-46a7-9834-5939999eeed7
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/ledger","correlationId":"qa-2154aac9-1f09-46a7-9834-5939999eeed7"}
```

## 80. POST /v1/credits/purchases

```text
#80 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f8e03412-fb96-49be-bac8-60f1ef1b3b55

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3b68b2fc0e1f41fd82e6f87c4f341e89
X-Correlation-Id: qa-f8e03412-fb96-49be-bac8-60f1ef1b3b55
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 429 in 3 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f8e03412-fb96-49be-bac8-60f1ef1b3b55
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/purchases","correlationId":"qa-f8e03412-fb96-49be-bac8-60f1ef1b3b55"}
```

## 81. GET /v1/admin/stats

```text
#81 GET http://localhost:7070/v1/admin/stats
correlation: qa-19d65aab-fd2e-4e85-8306-a81db1ad371d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19d65aab-fd2e-4e85-8306-a81db1ad371d
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-19d65aab-fd2e-4e85-8306-a81db1ad371d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/admin/stats","correlationId":"qa-19d65aab-fd2e-4e85-8306-a81db1ad371d"}
```

## 82. GET /v1/accounts/me

```text
#82 GET http://localhost:7070/v1/accounts/me
correlation: qa-87fb5f7b-e57c-48e1-914e-c363dd1f708d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87fb5f7b-e57c-48e1-914e-c363dd1f708d
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 04 Nov 2026 09:28:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-87fb5f7b-e57c-48e1-914e-c363dd1f708d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-87fb5f7b-e57c-48e1-914e-c363dd1f708d"}
```

## 83. GET /v1/accounts/me

```text
#83 GET http://localhost:7070/v1/accounts/me
correlation: qa-facc72ca-80a0-4cc2-8a89-4e8c75ea18db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-facc72ca-80a0-4cc2-8a89-4e8c75ea18db
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 04 Nov 2026 09:28:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-facc72ca-80a0-4cc2-8a89-4e8c75ea18db
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-facc72ca-80a0-4cc2-8a89-4e8c75ea18db"}
```

## 84. GET /v1/accounts/me

```text
#84 GET http://localhost:7070/v1/accounts/me
correlation: qa-8bdcbb76-30ca-4ef1-8e81-f1a02e6b2675

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bdcbb76-30ca-4ef1-8e81-f1a02e6b2675
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 04 Nov 2026 09:28:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8bdcbb76-30ca-4ef1-8e81-f1a02e6b2675
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8bdcbb76-30ca-4ef1-8e81-f1a02e6b2675"}
```

## 85. GET /v1/accounts/me

```text
#85 GET http://localhost:7070/v1/accounts/me
correlation: qa-1df0497e-3f8e-4a47-99b0-84430db76e2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1df0497e-3f8e-4a47-99b0-84430db76e2c
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 04 Nov 2026 09:28:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1df0497e-3f8e-4a47-99b0-84430db76e2c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-1df0497e-3f8e-4a47-99b0-84430db76e2c"}
```

## 86. GET /v1/accounts/me

```text
#86 GET http://localhost:7070/v1/accounts/me
correlation: qa-5855f5ff-22fb-4cbe-b6d1-1303330cbee0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5855f5ff-22fb-4cbe-b6d1-1303330cbee0
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 04 Nov 2026 09:28:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5855f5ff-22fb-4cbe-b6d1-1303330cbee0
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-5855f5ff-22fb-4cbe-b6d1-1303330cbee0"}
```

## 87. GET /v1/accounts/me

```text
#87 GET http://localhost:7070/v1/accounts/me
correlation: qa-5899e090-f03e-4998-912e-76fa5b8eea84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5899e090-f03e-4998-912e-76fa5b8eea84
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 04 Nov 2026 09:28:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5899e090-f03e-4998-912e-76fa5b8eea84
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-5899e090-f03e-4998-912e-76fa5b8eea84"}
```

## 88. GET /v1/accounts/me

```text
#88 GET http://localhost:7070/v1/accounts/me
correlation: qa-ad72838b-9884-43aa-ac86-93bdf554a210

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad72838b-9884-43aa-ac86-93bdf554a210
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 04 Nov 2026 09:28:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ad72838b-9884-43aa-ac86-93bdf554a210
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ad72838b-9884-43aa-ac86-93bdf554a210"}
```

## 89. GET /v1/accounts/me

```text
#89 GET http://localhost:7070/v1/accounts/me
correlation: qa-64575c6a-49df-46df-aaa8-51a787826f87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64575c6a-49df-46df-aaa8-51a787826f87
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 04 Nov 2026 09:28:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-64575c6a-49df-46df-aaa8-51a787826f87
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-64575c6a-49df-46df-aaa8-51a787826f87"}
```

## 90. GET /v1/accounts/me

```text
#90 GET http://localhost:7070/v1/accounts/me
correlation: qa-74fffab7-3ad7-4ca4-b067-c7c5e2fd0f8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74fffab7-3ad7-4ca4-b067-c7c5e2fd0f8b
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 04 Nov 2026 09:28:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-74fffab7-3ad7-4ca4-b067-c7c5e2fd0f8b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-74fffab7-3ad7-4ca4-b067-c7c5e2fd0f8b"}
```

## 91. GET /v1/accounts/me

```text
#91 GET http://localhost:7070/v1/accounts/me
correlation: qa-406d9dbb-5034-4b92-ab7e-c2e33e1fe4b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-406d9dbb-5034-4b92-ab7e-c2e33e1fe4b9
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 04 Nov 2026 09:28:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-406d9dbb-5034-4b92-ab7e-c2e33e1fe4b9
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-406d9dbb-5034-4b92-ab7e-c2e33e1fe4b9"}
```

## 92. GET /v1/accounts/me

```text
#92 GET http://localhost:7070/v1/accounts/me
correlation: qa-9b4549cc-5e23-4230-86fc-db7f271f7095

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b4549cc-5e23-4230-86fc-db7f271f7095
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 04 Nov 2026 09:28:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9b4549cc-5e23-4230-86fc-db7f271f7095
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9b4549cc-5e23-4230-86fc-db7f271f7095"}
```

## 93. GET /v1/accounts/me

```text
#93 GET http://localhost:7070/v1/accounts/me
correlation: qa-ef9b725a-fd06-465f-a15f-9006ec3a92ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef9b725a-fd06-465f-a15f-9006ec3a92ca
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Wed, 04 Nov 2026 09:28:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ef9b725a-fd06-465f-a15f-9006ec3a92ca
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ef9b725a-fd06-465f-a15f-9006ec3a92ca"}
```

## 94. GET /v1/accounts/me

```text
#94 GET http://localhost:7070/v1/accounts/me
correlation: qa-175e1e51-53ad-40f3-b2bd-6dae2fdd637d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-175e1e51-53ad-40f3-b2bd-6dae2fdd637d
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Wed, 04 Nov 2026 09:28:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-175e1e51-53ad-40f3-b2bd-6dae2fdd637d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-175e1e51-53ad-40f3-b2bd-6dae2fdd637d"}
```

## 95. GET /v1/accounts/me

```text
#95 GET http://localhost:7070/v1/accounts/me
correlation: qa-e0773ef6-d4c3-4b74-95c9-f8b49016209b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0773ef6-d4c3-4b74-95c9-f8b49016209b
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 04 Nov 2026 09:28:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e0773ef6-d4c3-4b74-95c9-f8b49016209b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-e0773ef6-d4c3-4b74-95c9-f8b49016209b"}
```

## 96. GET /v1/accounts/me

```text
#96 GET http://localhost:7070/v1/accounts/me
correlation: qa-4b1a29c9-0b80-4e6a-a50a-3ffd1cddbcf6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b1a29c9-0b80-4e6a-a50a-3ffd1cddbcf6
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 04 Nov 2026 09:28:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4b1a29c9-0b80-4e6a-a50a-3ffd1cddbcf6
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-4b1a29c9-0b80-4e6a-a50a-3ffd1cddbcf6"}
```

## 97. GET /v1/accounts/me

```text
#97 GET http://localhost:7070/v1/accounts/me
correlation: qa-03758d6f-992b-48be-955d-315ff7c4e73d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03758d6f-992b-48be-955d-315ff7c4e73d
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-03758d6f-992b-48be-955d-315ff7c4e73d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-03758d6f-992b-48be-955d-315ff7c4e73d"}
```

## 98. GET /v1/accounts/me

```text
#98 GET http://localhost:7070/v1/accounts/me
correlation: qa-5ad0bc6e-06ed-41de-9a65-053c2a8bef68

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ad0bc6e-06ed-41de-9a65-053c2a8bef68
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 04 Nov 2026 09:28:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ad0bc6e-06ed-41de-9a65-053c2a8bef68
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

{"id":"acc_87e00167-3624-4243-8f98-ed56af700c28","handle":"qa-172cfabfae83","displayName":"QA 172cfabfae83","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.776499537Z"}
```

## 99. POST /v1/auth/token

```text
#99 POST http://localhost:7070/v1/auth/token
correlation: qa-571bf1de-70a8-4c4e-9545-cc670de293da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-571bf1de-70a8-4c4e-9545-cc670de293da
Content-Type: application/json

--- request body ---
{"handle":"qa-caa0a5423f69","password":"****"}

--- response: 200 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-571bf1de-70a8-4c4e-9545-cc670de293da
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0d42b5ee-d572-40cf-8b4f-9935cde525cd"}
```

## 100. DELETE /v1/accounts/me

```text
#100 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-62bcd3da-81d4-4723-baae-2e0f0729f6c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62bcd3da-81d4-4723-baae-2e0f0729f6c3
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Wed, 04 Nov 2026 09:28:13 GMT
Content-Type: text/plain
X-Correlation-Id: qa-62bcd3da-81d4-4723-baae-2e0f0729f6c3
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

## 101. POST /v1/auth/token

```text
#101 POST http://localhost:7070/v1/auth/token
correlation: qa-6e4c6e63-0eff-49e9-9657-b826a5846ab9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e4c6e63-0eff-49e9-9657-b826a5846ab9
Content-Type: application/json

--- request body ---
{"handle":"qa-caa0a5423f69","password":"****"}

--- response: 401 in 3 ms ---
Date: Wed, 04 Nov 2026 09:28:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6e4c6e63-0eff-49e9-9657-b826a5846ab9
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6e4c6e63-0eff-49e9-9657-b826a5846ab9"}
```

## 102. DELETE /v1/accounts/me

```text
#102 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-993e0845-79f6-4b43-8de4-31116ea6d95e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-993e0845-79f6-4b43-8de4-31116ea6d95e
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Wed, 04 Nov 2026 09:28:13 GMT
Content-Type: text/plain
X-Correlation-Id: qa-993e0845-79f6-4b43-8de4-31116ea6d95e
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

## 103. POST /v1/auth/token

```text
#103 POST http://localhost:7070/v1/auth/token
correlation: qa-6ce0b787-b562-49f3-b13c-11fb1141d860

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ce0b787-b562-49f3-b13c-11fb1141d860
Content-Type: application/json

--- request body ---
{"handle":"qa-172cfabfae83","password":"****"}

--- response: 401 in 3 ms ---
Date: Wed, 04 Nov 2026 09:28:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6ce0b787-b562-49f3-b13c-11fb1141d860
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6ce0b787-b562-49f3-b13c-11fb1141d860"}
```
